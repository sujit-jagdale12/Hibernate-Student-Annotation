package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernateUtil.HibernateUtil;
import com.model.Student;


public class Update {

	public static void main(String[] args) {

		SessionFactory  factory=HibernateUtil.getSessionFactory();
		Session session=HibernateUtil.getSession();
		
		try(factory;session){
			session.beginTransaction();		
			
			Student student=session.get(Student.class, 2);
			student.setName("Daya Kale");
			
			session.getTransaction().commit();
			
			System.out.println("Updated...");
			
		}
	}

}
