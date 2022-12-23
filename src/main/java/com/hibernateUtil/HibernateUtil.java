package com.hibernateUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Student;


public class HibernateUtil {

	public static SessionFactory factory;
	static {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		//If you didn't provide mapping class in configuration xml then use addAnnotationClass
		//configuration.addAnnotatedClass(Student.class);
		factory=configuration.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		return factory;
	}
	public static Session getSession() {
		return factory.openSession();
	}
}
