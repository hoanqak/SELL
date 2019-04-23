package com.sell.service;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.sell.entity.Product;
import com.sell.hibernate.HibernateUI;
@Service
public class Search {
	int total = 12;
	public List<Product> getResultSearch(String keyword) {
		Session session = HibernateUI.getSessionFactory().openSession();
		Query query = session.createQuery("From Product as P Where P.name like '%" + keyword + "%'");
		@SuppressWarnings("unchecked")
		List<Product> list = query.getResultList();
		session.close();
		return list;

	}

	@SuppressWarnings("static-access")
	public String push(String keyword, Model model, int page) {
		Pagination pagination = new Pagination();
		List<Product> list = getResultSearch(keyword);
		int size = list.size();
		if(size == 0) {
			model.addAttribute("notResult", "Không có kết quả nào cho " + keyword);
			return "view/ResultSearch";
		}
		model.addAttribute("keyword", keyword);
		model.addAttribute("page", pagination.Page(list, 12));
<<<<<<< HEAD
		model.addAttribute("keyword", keyword);
=======
>>>>>>> 7c18d6d1a1766967ab90fbf07be708ca746d1e8e
		model.addAttribute("result", "Có " + size + " kết quả tìm kiếm cho " + keyword);
		model.addAttribute("listResult", pagination.paginationSearch(total, page, keyword));
		return "view/ResultSearch";
	}

}
