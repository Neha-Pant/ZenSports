package net.sports.ZenSportsFrontEnd.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import net.sports.ZenSportsBackEnd.dao.IProductDAO;
import net.sports.ZenSportsBackEnd.model.Product;

@Controller
public class FrontEndProductController {
	@Autowired
	private IProductDAO productDAO;

	@RequestMapping(value = { "/products" })
	public ModelAndView about() {
		ModelAndView model = new ModelAndView("page");
		model.addObject("title", "Products");
		model.addObject("userClickProducts", true);
		model.addObject("list", productDAO.getProducts());
		return model;
	}
	@RequestMapping(value = { "/product" })
	public @ResponseBody List<Product> product() {
		return productDAO.getProducts();
	}

	@RequestMapping("/showProduct")
	public ModelAndView showProduct() {
		ModelAndView model = new ModelAndView("Products");
		model.addObject("list", productDAO.getProducts());
		return model;
	}
	
	@RequestMapping("/productCRUD")
	public ModelAndView productcrud() {
		ModelAndView model = new ModelAndView("page");
		model.addObject("title", "Product Management");
		model.addObject("userClickProductCRUD", true);
		model.addObject("product",new Product());
		model.addObject("productList", productDAO.getProducts());
		return model;
	}

	@RequestMapping(value="/productData.do",method=RequestMethod.POST)
	public String doActions(@Valid Product productV,@ModelAttribute("product") Product product,BindingResult result , @RequestParam String action,Model model)
	{
		Product productResult=new Product();
		switch(action.toLowerCase())
		{
		case "add":
			productDAO.addProducts(product);
			productResult=product;
			break;
		case "edit":
			productDAO.updateProduct(product);
			productResult=product;
			break;
		case "delete":
			productDAO.deleteProduct(product.getProductId());
			productResult=product;
			break;
		case "search":
			Product searchedProduct= productDAO.getProduct(product.getProductId());
			productResult=searchedProduct!=null?searchedProduct:new Product();
			break;
		}
		model.addAttribute("product",productResult);
		model.addAttribute("productList",productDAO.getProducts());
		return "redirect:productCRUD";
	}
}
