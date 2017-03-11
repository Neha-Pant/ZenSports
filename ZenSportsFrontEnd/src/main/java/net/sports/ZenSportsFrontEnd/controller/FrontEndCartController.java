package net.sports.ZenSportsFrontEnd.controller;

import java.security.Principal;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import net.sports.ZenSportsBackEnd.dao.ICartItemDAO;
import net.sports.ZenSportsBackEnd.dao.IPaymentDAO;
import net.sports.ZenSportsBackEnd.dao.IProductDAO;
import net.sports.ZenSportsBackEnd.dao.IUserDAO;
import net.sports.ZenSportsBackEnd.model.Cart;
import net.sports.ZenSportsBackEnd.model.CartItem;
import net.sports.ZenSportsBackEnd.model.Payment;
import net.sports.ZenSportsBackEnd.model.Product;
import net.sports.ZenSportsBackEnd.model.User;

@Controller
public class FrontEndCartController {

	@Autowired
	IProductDAO productDAO;
	@Autowired
	ICartItemDAO cartItemDAO;
	@Autowired
	IUserDAO userDAO;
	@Autowired
	IPaymentDAO paymentDAO;

	@RequestMapping(value = { "/user/{productId}" })
	public ModelAndView addToCart(@PathVariable("productId") int id, @RequestParam("quantity") String quantity,
			Principal principal) {

		ModelAndView model;

		if (principal != null) {

			model = new ModelAndView("page");
			User u = userDAO.getUserByUserName(principal.getName());

			Product p = productDAO.getProduct(id);
			// User u=userDAO.getUser(uid);
			CartItem ci = new CartItem();
			Cart c = u.getCart();

			// calculating subTotal for cartItems
			int unitPrice = p.getProductPrice();
			int q=Integer.parseInt(quantity);
			int subTotal = unitPrice * q;

			// updating cart instance
			int totalPrice = c.getGrandTotal();
			totalPrice += subTotal;
			c.setGrandTotal(totalPrice);
			int items = c.getItemCounts();
			items+=1;
			c.setItemCounts(items);

			// update cartitem instance
			ci.setCart(c);
			ci.setQuantity(q);
			ci.setTotalPrice(new Double(subTotal));
			ci.setProduct(productDAO.getProduct(id));

			// updating product instance
//			int i_q = p.getProductQuantity();
//			int f_q = i_q - quantity;
//			p.setProductQuantity(f_q);

			// addding cart item
			cartItemDAO.addCartItem(ci);

			// updating cart
			cartItemDAO.updateCart(c);

			// updating product
//			productDAO.updateProduct(p);

			model.addObject("title", "Products");
			model.addObject("userClickProducts", true);
			model.addObject("product", new Product());
			model.addObject("productList", productDAO.getProducts());
		} 
		else {
			model = new ModelAndView("login");
		}
		return model;
	}
	
	@RequestMapping(value = { "/user/payment" })
	public ModelAndView payment(@ModelAttribute("payment") @Valid Payment p)
	{
		ModelAndView model=new ModelAndView("invoice");
		paymentDAO.addPayment(p);
		Payment p1=new Payment();
		p1=p;
		model.addObject("payment", p1);
		return model;
		
	}
}
