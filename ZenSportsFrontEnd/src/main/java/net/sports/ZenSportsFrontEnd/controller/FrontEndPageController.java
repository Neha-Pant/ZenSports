package net.sports.ZenSportsFrontEnd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FrontEndPageController {
	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("page");
		model.addObject("greeting","Welcome to ZenSport.com");
		return model;
	}
}
