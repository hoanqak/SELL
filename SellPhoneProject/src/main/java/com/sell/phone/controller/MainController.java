package com.sell.phone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sell.dao.impl.CategoryImpl;
import com.sell.dao.impl.ImageImpl;
import com.sell.dao.impl.ProductImpl;
import com.sell.service.HomeController;

@Controller
public class MainController {
	@Autowired
	HomeController homeController;
	@RequestMapping("/")
	public String index(Model model) {
		homeController.index(model);
		return "view/Home";
	}
	@RequestMapping("/show-info")
	public String showinfo(){
		return "view/show-info";
	}
	
}
