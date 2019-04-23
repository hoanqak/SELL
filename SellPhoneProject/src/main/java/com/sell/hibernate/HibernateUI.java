package com.sell.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUI {

	public static SessionFactory getSessionFactory() {
		return new Configuration().configure().buildSessionFactory();
	}
	
	public static void main(String[] args) {
		System.out.println(getSessionFactory().openSession().isConnected());
	}
	
}
