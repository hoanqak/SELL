package com.sell.dao.impl;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.stereotype.Component;

import com.sell.dao.ProductDAO;
import com.sell.entity.Category;
import com.sell.entity.Product;
import com.sell.hibernate.HibernateUI;
@Component
public class ProductImpl implements ProductDAO {

	// lấy obj product
	public Product getProduct(int id) {
		Session session = HibernateUI.getSessionFactory().openSession();
		Product product = session.get(Product.class, id);
		session.close();
		return product;
	}

	public void updateProduct(Product product) {
		Session session = HibernateUI.getSessionFactory().openSession();
		session.update(product);
		session.beginTransaction().commit();
		session.close();
	}

	public void deleteProduct(Product product) {
		Session session = HibernateUI.getSessionFactory().openSession();
		session.delete(product);
		session.beginTransaction().commit();
		session.close();
	}

	public void insertProduct(Product product) {
		Session session = HibernateUI.getSessionFactory().openSession();
		session.save(product);
		session.beginTransaction().commit();
		session.close();

	}

	//lấy list product theo category
	public List<Product> getListProductByCategory(Category category) {
		return category.getListProduct();
	}

	// lấy all product
	public List<Product> getAllListProduct() {
		@SuppressWarnings("unchecked")
		List<Product> list = HibernateUI.getSessionFactory().openSession()
				.createQuery("From " + Product.class.getName() + " as p ORDER BY p.id DESC").getResultList();

		return list;
	}

	//lấy list product nổi bật
	public List<Product> getProductHightLights(int number) {
		Session session = HibernateUI.getSessionFactory().openSession();
		Query query = session.createQuery("From " + Product.class.getName() +" as p order by p.price desc");
		query.setFirstResult(0);
		query.setMaxResults(number);
		@SuppressWarnings("unchecked")
		List<Product> list = query.getResultList();
		session.close();
		return list;

	}

	// lấy số product mới nhất
	public List<Product> getProductNew(int number) {
		Session session = HibernateUI.getSessionFactory().openSession();
		Query query = session.createQuery("From " + Product.class.getName() +" as p order by p.id ");
		query.setMaxResults(number);
		@SuppressWarnings("unchecked")
		List<Product> list = query.getResultList();
		session.close();
		return list;
	}

}
