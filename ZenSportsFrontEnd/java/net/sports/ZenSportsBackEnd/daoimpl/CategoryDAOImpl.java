package net.sports.ZenSportsBackEnd.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.sports.ZenSportsBackEnd.dao.ICategoryDAO;
import net.sports.ZenSportsBackEnd.model.Category;

@Repository("categoryDAO")
@Transactional
public class CategoryDAOImpl implements ICategoryDAO
{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Category> getCategories() 
	{
		return sessionFactory.getCurrentSession().createQuery("FROM Category",Category.class).getResultList();
	}

}
