package net.sports.ZenSportsFrontEnd.handler;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import net.sports.ZenSportsBackEnd.dao.IAddressDAO;
import net.sports.ZenSportsBackEnd.dao.ICartItemDAO;
import net.sports.ZenSportsBackEnd.dao.IPaymentDAO;
import net.sports.ZenSportsBackEnd.dao.IUserDAO;
import net.sports.ZenSportsBackEnd.model.Address;
import net.sports.ZenSportsBackEnd.model.Cart;
import net.sports.ZenSportsBackEnd.model.CartModel;
import net.sports.ZenSportsBackEnd.model.Payment;
import net.sports.ZenSportsBackEnd.model.User;

@Component
public class CartHandler {

	@Autowired
	IUserDAO userDAO;

	@Autowired
	IAddressDAO addressDAO;

	@Autowired
	ICartItemDAO cartItemDAO;

	@Autowired
	IPaymentDAO paymentDAO;	
	
	@Autowired
	HttpSession session;
	
	User user;
	CartModel cartModel;
	Cart c;
	
	public CartModel initializeModel() {
		user=(User)session.getAttribute("user");
		cartModel=new CartModel();
		cartModel.setBillingAddress(addressDAO.getAddressByUser(user));
		cartModel.setCartItem(cartItemDAO.getAllCartItem(user.getCart()));
		return cartModel;
		
	}


	public void saveBillingAddress(CartModel cartModel, Address billing) {
		cartModel.setBillingAddress(billing);
	}

	public void saveShippingAddress(CartModel cartModel, Address shipping) {
		if(shipping.getAddAddress1()!="")
		{
		shipping.setShipping(true);
		cartModel.setShippingAddress(shipping);
		}
	}

	public void savePayment(CartModel cartModel, Payment payment) {
		payment.setUser(user);
		//c=user.getCart();
		c=cartModel.getCartItem().get(0).getCart();
		payment.setTotalPayment(c.getGrandTotal());
		cartModel.setPayment(payment);
	}

	public void storeDetail(CartModel cartModel) {
	    
		if(cartModel.getShippingAddress().isShipping()) 
        { 
        Address a=cartModel.getShippingAddress();
        a.setUser(user); 
        addressDAO.addAddress(a); 
        } 
        
        c=cartModel.getCartItem().get(0).getCart(); 
        
        Payment p=cartModel.getPayment(); 
        //p.setTotalPayment(c.getGrandTotal());
        paymentDAO.addPayment(p); 
        //cartModel.setPayment(p);
        System.out.println("cart items :"+cartItemDAO.getAllCartItem(c).toString());
        cartItemDAO.deleteAllCartItem(cartItemDAO.getAllCartItem(c)); 
        c.setGrandTotal(0); 
        c.setItemCounts(0); 
        cartItemDAO.updateCart(c); 
	}

}
