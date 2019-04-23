package com.sell.service;

import java.util.List;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.stereotype.Service;

import com.sell.entity.Category;
import com.sell.entity.Product;
import com.sell.hibernate.HibernateUI;
@Service
public class Pagination {

	@SuppressWarnings("unchecked")
	public static List<Product> pagination(int total, int page, int id) {
		List<Product> list = null;
		int first = 0;

		if(page > 1) {
			first = (first + total) * (page - 1);
		}
		
		Session session = HibernateUI.getSessionFactory().openSession();
		Query query = session.createQuery("From " + Product.class.getName() + " as p where p.category = "+id+" order by p.id desc");
		query.setFirstResult(first);
		System.out.println("First " +first);
		query.setMaxResults(total);
		list = query.getResultList();
		return list;

	}
	public static List<Product> pagination(int total, int page) {
		List<Product> list = null;
		int first = 0;

		if(page > 1) {
			first = (first + total) * (page - 1);
		}
		
		Session session = HibernateUI.getSessionFactory().openSession();
		Query query = session.createQuery("From " + Product.class.getName() + " as p order by p.id desc");
		query.setFirstResult(first);
		System.out.println("First " +first);
		query.setMaxResults(total);
		list = query.getResultList();
		return list;

	}
	
	public static int Page(List<Product> list, int total) {
		int page = list.size() / total;
		if(list.size() % total != 0) {
			page += 1;
		}
		
		return page;
	}
	

	public static void main(String[] args) {
		int page = 0;
		for(Product product : pagination(5, page, 2)) {
			System.out.println(product.getId());
		}
		System.out.println(Page(pagination(5, page, 1), 5));
	}

}
