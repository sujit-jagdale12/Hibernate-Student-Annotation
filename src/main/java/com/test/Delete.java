package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernateUtil.HibernateUtil;
import com.model.Student;

public class Delete {

	public static void main(String[] args) {

		SessionFactory  factory=HibernateUtil.getSessionFactory();
		Session session=HibernateUtil.getSession();
		
		try(factory;session){
			session.beginTransaction();	
				
			Student student=session.load(Student.class, 2);
			session.delete(student);
			
			
			session.getTransaction().commit();
			System.out.println("Deleted...");
		}
	}

}
