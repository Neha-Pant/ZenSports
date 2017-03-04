package net.sports.ZenSportsBackEnd.daoimpl;

import java.util.*;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import net.sports.ZenSportsBackEnd.model.*;
import net.sports.ZenSportsBackEnd.dao.*;

@Repository("productDAO")
@Transactional
public class ProductDAOImpl implements IProductDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public List<Product> getProducts() {
		return sessionFactory.getCurrentSession().createQuery("FROM Product", Product.class).getResultList();
	}

	public boolean addProducts(Product p) {
		try {
			sessionFactory.getCurrentSession().persist(p);
			return true;
		} catch (Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

	public Product getProduct(int id) {
		List<Product> products = new ArrayList<Product>();
		products = getProducts();

		return products.get(id);

	}

}
