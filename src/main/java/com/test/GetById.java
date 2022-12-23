package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernateUtil.HibernateUtil;
import com.model.Student;

public class GetById {

	public static void main(String[] args) {

		SessionFactory  factory=HibernateUtil.getSessionFactory();
		Session session=HibernateUtil.getSession();
		
		try(factory;session){
			session.beginTransaction();	
			
			Student student=session.get(Student.class, 2);
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getEmail());
			System.out.println(student.getBranch());
			System.out.println(student.getAge());
		}
	}

}
