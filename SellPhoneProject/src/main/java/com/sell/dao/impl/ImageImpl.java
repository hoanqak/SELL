package com.sell.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.sell.dao.ListImageDAO;
import com.sell.entity.ListImage;
import com.sell.entity.Product;
import com.sell.hibernate.HibernateUI;
@Component
public class ImageImpl implements ListImageDAO{
	SessionFactory factory = HibernateUI.getSessionFactory();
	//Lấy danh sách các ảnh
	public List<ListImage> getAllListImage() {
		Session session = factory.openSession();
		List<ListImage> list = session.createQuery("From " + ListImage.class.getName()).getResultList();
		session.close();
		return list;
	}

	//Lấy list ảnh của 1 product
	public List<ListImage> getListImageByProduct(Product product) {
		return product.getListImage();
	}

	//lấy list ảnh theo id
	public ListImage getImage(int id) {
		Session session = factory.openSession();
		ListImage image = session.get(ListImage.class, id);
		session.close();
		return image;
	}

	public void deleteImage(ListImage image) {
		Session session = factory.openSession();
		session.delete(image);
		session.beginTransaction().commit();
		session.close();
	}

	public void updateImage(ListImage image) {
		Session session = factory.openSession();
		session.update(image);
		session.beginTransaction().commit();
		session.close();		
	}

	public void insertImage(ListImage image) {
		Session session = factory.openSession();
		session.save(image);
		session.beginTransaction().commit();
		session.close();		
	}

}
