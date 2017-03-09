package net.sports.ZenSportsFrontEnd.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import net.sports.ZenSportsBackEnd.dao.IProductDAO;
import net.sports.ZenSportsBackEnd.model.Product;

@Controller

public class FrontEndProductController {
	@Autowired
	private IProductDAO productDAO;

	@Autowired
	private HttpServletRequest request;

	@RequestMapping(value = { "/user/products" })
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

	@RequestMapping("/user/showProduct")
	public ModelAndView showProduct() {
		ModelAndView model = new ModelAndView("Products");
		model.addObject("list", productDAO.getProducts());
		return model;
	}

	@RequestMapping("/admin/productCRUD")
	public ModelAndView productcrud() {
		ModelAndView model = new ModelAndView("page");
		model.addObject("title", "Product Management");
		model.addObject("userClickProductCRUD", true);
		model.addObject("product", new Product());
		model.addObject("productList", productDAO.getProducts());
		return model;
	}

	@RequestMapping(value = "/productData.do", method = RequestMethod.POST)
	public ModelAndView doActions(@ModelAttribute("product") @Valid Product product, BindingResult result,
			@RequestParam String action) {
		Product productResult = new Product();
		if (result.hasErrors()) {
			ModelAndView model1 = new ModelAndView("page");
			model1.addObject("title", "Product Management");
			model1.addObject("userClickProductCRUD", true);
			return model1;
		}

		switch (action.toLowerCase()) {
		case "add":
			if(!(product.getFile().getOriginalFilename().equals("")))
			{
				product.setProductImage(uploadImage(product.getFile()));
			}
			productDAO.addProducts(product);
			productResult = product;
			break;
		case "edit":
			productDAO.updateProduct(product);
			productResult = product;
			break;
		case "delete":
			productDAO.deleteProduct(product.getProductId());
			productResult = product;
			break;
		case "search":
			Product searchedProduct = productDAO.getProduct(product.getProductId());
			productResult = searchedProduct != null ? searchedProduct : new Product();
			break;
		}
		ModelAndView model1 = new ModelAndView("page");
		model1.addObject("product", productResult);
		model1.addObject("productList", productDAO.getProducts());
		model1.addObject("title", "Product Management");
		model1.addObject("userClickProductCRUD", true);
		return model1;
	}

	protected String uploadImage(MultipartFile multipart)
			{
			String folderToUpload="/resources/images/";
			String filename=multipart.getOriginalFilename();
			String realPath=request.getServletContext().getRealPath(folderToUpload);
			if(!new File(realPath).exists())
			{
			new File(realPath).mkdirs();
			}
			String filePath=realPath+filename;
			File destination=new File(filePath);
			try
			{
			multipart.transferTo(destination);
			}
			catch(Exception ex){}
			return filename;
			}

}
