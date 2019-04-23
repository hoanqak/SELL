package com.sell.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import com.sell.dao.impl.CategoryImpl;
import com.sell.dao.impl.ProductImpl;
import com.sell.entity.Category;
import com.sell.entity.Product;

@Service
public class CategoryService {

	@Autowired
	ProductImpl product;
	@Autowired
	Pagination pagination;
	int total = 12;

	public void htc(Model model, int page) {
		Category category = new CategoryImpl().getCategory(1);
		model.addAttribute("category", category.getCategory());
		List<Product> list = Pagination.pagination(total, page, category.getId());
		model.addAttribute("type", "htc");
		model.addAttribute("page", pagination.Page(category.getListProduct(), total));
		model.addAttribute("product", list);
	}

	public void iphone(Model model, int page) {
		Category category = new CategoryImpl().getCategory(2);
		model.addAttribute("type", "iphone");
		model.addAttribute("category", category.getCategory());
		List<Product> list = Pagination.pagination(total, page, category.getId());
		model.addAttribute("page", pagination.Page(category.getListProduct(), total));
		model.addAttribute("product", list);
	}

	public void samsung(Model model, int page) {
		Category category = new CategoryImpl().getCategory(6);
		model.addAttribute("category", category.getCategory());
		model.addAttribute("type", "samsung");

		List<Product> list = Pagination.pagination(total, page, category.getId());
		model.addAttribute("page", pagination.Page(category.getListProduct(), total));
		model.addAttribute("product", list);
	}

	public void nokia(Model model, int page) {
		Category category = new CategoryImpl().getCategory(3);
		model.addAttribute("type", "nokia");
		model.addAttribute("category", category.getCategory());
		List<Product> list = Pagination.pagination(total, page, category.getId());
		model.addAttribute("page", pagination.Page(category.getListProduct(), total));
		model.addAttribute("product", list);
	}

	public void blackberry(Model model, int page) {
		Category category = new CategoryImpl().getCategory(5);
		model.addAttribute("type", "blackberry");
		model.addAttribute("category", category.getCategory());
		List<Product> list = Pagination.pagination(total, page, category.getId());
		model.addAttribute("page", pagination.Page(category.getListProduct(), total));
		model.addAttribute("product", list);
	}

	public void sony(Model model, int page) {
		Category category = new CategoryImpl().getCategory(4);
		model.addAttribute("category", category.getCategory());
<<<<<<< HEAD
		model.addAttribute("product", product.getListProductByCategory(category));

=======
<<<<<<< HEAD
<<<<<<< HEAD
=======

>>>>>>> parent of 8057a19... add view and any
		model.addAttribute("product", product.getListProductByCategory(category));
=======
>>>>>>> 7c18d6d1a1766967ab90fbf07be708ca746d1e8e
		model.addAttribute("type", "sony");
		List<Product> list = Pagination.pagination(total, page, category.getId());
		model.addAttribute("page", pagination.Page(category.getListProduct(), total));
		model.addAttribute("product", list);
>>>>>>> c8caac8777be131e73094d3e52d2959718faa85c
	}

}
