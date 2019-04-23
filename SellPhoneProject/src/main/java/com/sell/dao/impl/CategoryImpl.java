package com.sell.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Component;

import com.sell.dao.CategoryDAO;
import com.sell.entity.Category;
import com.sell.entity.Product;
import com.sell.hibernate.HibernateUI;
@Component
public class CategoryImpl implements CategoryDAO{
	//Lấy danh sách các category
	public List<Category> getListCategory() {
		Session session = HibernateUI.getSessionFactory().openSession();
		List<Category> list = session.createQuery("From " + Category.class.getName()).getResultList();
		session.close();
		return list;
	}

	//Lấy 1 obj category theo id
	public Category getCategory(int id) {
		Session session = HibernateUI.getSessionFactory().openSession();
		Category category = session.get(Category.class, id);
		session.close();
		return category;
	}

	public void deleteCategory(Category category) {
		Session session = HibernateUI.getSessionFactory().openSession();
		session.delete(category);
		session.beginTransaction().commit();
		session.close();
	}

	public void updateCategory(Category category) {
		Session session = HibernateUI.getSessionFactory().openSession();
		session.update(category);
		session.beginTransaction().commit();
		session.close();		
	}

	public void insertCategory(Category category) {
		Session session = HibernateUI.getSessionFactory().openSession();
		session.save(category);
		session.beginTransaction().commit();
		session.close();		
	}
	
	public static void main(String[] args) {
		CategoryImpl c = new CategoryImpl();
		ProductImpl p = new ProductImpl();
		Product product = p.getProduct(3);
		product.getDescription();
		System.out.println(product.getCategory().getCategory());
	}

}
