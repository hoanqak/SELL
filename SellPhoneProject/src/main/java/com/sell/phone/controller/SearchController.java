package com.sell.phone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sell.service.CategoryService;
import com.sell.service.Search;

@Controller
public class SearchController {

	@Autowired
	Search search;
	@Autowired
	CategoryService categoryService;
	@RequestMapping("/result")
	public String resultSearch(@RequestParam("search") String keyword, Model model) {
		return search.push(keyword, model, 1);
	}
	
	@RequestMapping("result-search-page-{i}")
	public String searchPage(@RequestParam("keyword") String keyword, Model model,@PathVariable("i") int page) {
		search.push(keyword, model, page);
		return "view/ResultSearch";
	}
	
}
