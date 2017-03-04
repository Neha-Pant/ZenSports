package net.sports.ZenSportsFrontEnd.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
