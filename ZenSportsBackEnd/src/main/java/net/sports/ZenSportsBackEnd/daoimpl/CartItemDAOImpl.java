package net.sports.ZenSportsBackEnd.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.sports.ZenSportsBackEnd.dao.ICartItemDAO;
import net.sports.ZenSportsBackEnd.dao.IUserDAO;
import net.sports.ZenSportsBackEnd.model.Cart;
import net.sports.ZenSportsBackEnd.model.CartItem;

@Repository("cartItemDAO")
@Transactional
public class CartItemDAOImpl implements ICartItemDAO
{
	@Autowired
    SessionFactory sessionFactory;
    IUserDAO userDAO;
    public List<CartItem> getAllCartItem(Cart cart){
                                                 
                   return sessionFactory.getCurrentSession().createQuery("from CartItem", CartItem.class).getResultList();
    }
    public CartItem getCartItem(int id){
                   return sessionFactory.getCurrentSession().get(CartItem.class,Integer.valueOf(id));
    }
    
    public boolean addCartItem(CartItem ci){
                   try {
                                  sessionFactory.getCurrentSession().persist(ci);
                                  return true;
                   } catch (Exception e) {
                                  e.printStackTrace();
                                  return false;
                   }
    }
    public boolean updateCartItem(CartItem ci){
                   try {
                                  sessionFactory.getCurrentSession().update(ci);
                                  return true;
                   } catch (Exception e) {
                                  e.printStackTrace();
                                  return false;
                   }
    }
    public boolean deleteCartItem(int cartItemId){
                   try {
                                  sessionFactory.getCurrentSession().delete(getCartItem(cartItemId));
                                  return true;
                   } catch (Exception e) {
                                  e.printStackTrace();
                                  return false;
                   }
    }
	
}
