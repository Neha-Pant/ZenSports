package net.sports.ZenSportsBackEnd.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.sports.ZenSportsBackEnd.dao.IProductDAO;
import net.sports.ZenSportsBackEnd.model.Product;

public class ProductsTestCase {
	private static AnnotationConfigApplicationContext context;
	private static IProductDAO productDAO;
	private Product product;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("net.sports.ZenSportsBackEnd");
		context.refresh();
		productDAO=(IProductDAO)context.getBean("productDAO");
	}
//	@Test
//	public void testAddProduct()
//	{
//		product=new Product();
//		//product.setProductId(107);
//		product.setProductName("FITNESS WALKING SUNGLASSES");
//		product.setProductCategory("Fitness");
//		product.setProductImage("P7.jpg");
//		product.setProductPrice(200);
//		product.setProductQuantity(5);
//		product.setProductDescription("Made for regular fitness walking in bright sunshine. ");
//		product.setProductKeyword("Fitness,Walking,Sunglass,Blue");
//		
//		assertEquals("Successfully added a product inside the table .",true,productDAO.addProducts(product));
//	}
//	@Test
//	public void testGetProduct()
//	{
//		product=productDAO.getProduct(1);
//		assertEquals("Retrieving data based on id from table","Pillow,Comfortable,Sleep,Travel",product.getProductKeyword());
//	}
//	
//	@Test
//	public void testDeleteProduct()
//	{
//		assertEquals("Deleting product based on id from table",true,productDAO.deleteProduct(20));
//	}
//	
//	@Test
//	public void testUpdateProduct()
//	{
//		product=productDAO.getProduct(7);
//		product.setProductName("Walking SUNGLASSES-Updated");
//		product.setProductCategory("Fitness");
//		product.setProductImage("P7.jpg");
//		product.setProductPrice(200);
//		product.setProductQuantity(5);
//		product.setProductDescription("Made for regular fitness walking in bright sunshine. ");
//		product.setProductKeyword("Fitness,Walking,Sunglass,Blue");
//		assertEquals("Updating user based on id from table",true,productDAO.updateProduct(product));
//	}
}
