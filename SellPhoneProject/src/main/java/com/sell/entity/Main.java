package com.sell.entity;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sell.dao.ProductDAO;
import com.sell.dao.impl.CategoryImpl;
import com.sell.dao.impl.ProductImpl;
import com.sell.hibernate.HibernateUI;


public class Main {

	static SessionFactory factory = new Configuration().configure().buildSessionFactory();
	public static void main(String[] args) {
		Session session = factory.openSession();
		Category category = new CategoryImpl().getCategory(1);
		System.out.println(category.getCategory());
		for(Product p: category.getListProduct()) {
			System.out.println(p.getName());
		}
	}
}
