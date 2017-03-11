//package net.sports.ZenSportsBackEnd.test;
//
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import net.sports.ZenSportsBackEnd.dao.ICartItemDAO;
//import net.sports.ZenSportsBackEnd.dao.IProductDAO;
//import net.sports.ZenSportsBackEnd.dao.IUserDAO;
//import net.sports.ZenSportsBackEnd.model.Cart;
//import net.sports.ZenSportsBackEnd.model.CartItem;
//import net.sports.ZenSportsBackEnd.model.Product;
//import net.sports.ZenSportsBackEnd.model.User;
//
//public class CartItemTestCase 
//{
//	private static AnnotationConfigApplicationContext context;
//	private static IProductDAO productDAO;
//	private static IUserDAO userDAO;
//	private static ICartItemDAO cartItemDAO;
//
//	@BeforeClass
//	public static void init() {
//		context = new AnnotationConfigApplicationContext();
//		context.scan("net.sports.ZenSportsBackEnd");
//		context.refresh();
//		productDAO=(IProductDAO)context.getBean("productDAO");
//		userDAO=(IUserDAO)context.getBean("userDAO");
//		cartItemDAO=(ICartItemDAO)context.getBean("cartItemDAO");
//	}
//	
//	@Test
//	public void testAddCartItem()
//	{
//		Product p=productDAO.getProduct(4);
//		User u=userDAO.getUser(1);
//		
//		CartItem ci = new CartItem();
//		Cart c = u.getCart();
//
//		// calculating subTotal for cartItems
//		int unitPrice = p.getProductPrice();
//		int subTotal = unitPrice * 2;
//
//		// updating cart instance
//		int totalPrice = c.getGrandTotal();
//		totalPrice += subTotal;
//		c.setGrandTotal(totalPrice);
//		int items = c.getItemCounts();
//		items+=1;
//		c.setItemCounts(items);
//
//		// update cartitem instance
//		ci.setCart(c);
//		ci.setQuantity(2);
//		ci.setTotalPrice(new Double(subTotal));
//		ci.setProduct(productDAO.getProduct(1));
//
//		// updating product instance
////		int i_q = p.getProductQuantity();
////		int f_q = i_q - 2;
////		p.setProductQuantity(f_q);
//
//		// addding cart item
//		cartItemDAO.addCartItem(ci);
//
//		// updating cart
//		//cartItemDAO.updateCart(c);
//
//		// updating product
//		//productDAO.updateProduct(p);
//	
//		assertEquals("Successfully added a product inside the table .",true,cartItemDAO.updateCart(c));
//		
//	}
//}
