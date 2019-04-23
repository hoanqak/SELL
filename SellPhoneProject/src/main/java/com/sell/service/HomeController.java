package com.sell.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import com.sell.dao.impl.ProductImpl;

@Service
public class HomeController {

	int numberOfProduct = 9;
	@Autowired
	ProductImpl product;
	public String index(Model model) {
		model.addAttribute("listProductHightLight", product.getProductNew(numberOfProduct));
		model.addAttribute("listProductNew", product.getProductNew(numberOfProduct));
		return "view/Home";
	}
	
}
