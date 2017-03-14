package net.sports.ZenSportsBackEnd.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.sports.ZenSportsBackEnd.dao.IAddressDAO;
import net.sports.ZenSportsBackEnd.model.Address;
import net.sports.ZenSportsBackEnd.model.User;

@Repository("addressDAO")
@Transactional
public class AddressDAOImpl implements IAddressDAO
{
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Address getAddress(int id) {
		return sessionFactory.getCurrentSession().get(Address.class, Integer.valueOf(id));
	}	
	
	@Override
	public List<Address> getAllAddress() {
		return sessionFactory.getCurrentSession().createQuery("FROM Address", Address.class).getResultList();
	}
		

	@Override
	public boolean deleteAddress(int id) {
		try {
			sessionFactory.getCurrentSession().delete(getAddress(id));
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean addAddress(Address a) {
		try {
			sessionFactory.getCurrentSession().save(a);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean updateAddress(Address a) {
		try {
			sessionFactory.getCurrentSession().update(a);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	@Override
	public Address getAddressByUser(User user) {
		return (Address)sessionFactory.getCurrentSession().createQuery("from Address where user=:user").setParameter("user",user).getResultList().get(0);
	}


}
