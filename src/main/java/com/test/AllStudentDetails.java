package com.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hibernateUtil.HibernateUtil;
import com.model.Student;

public class AllStudentDetails {

	public static void main(String[] args) {
		SessionFactory  factory=HibernateUtil.getSessionFactory();
		Session session=HibernateUtil.getSession();
		
		try(factory;session){
			session.beginTransaction();	
			
			List<Student> list=session.createQuery("from Student").list();
			for (Student student : list) {
				System.out.println(student.getId());
				System.out.println(student.getName());
				System.out.println(student.getEmail());
				System.out.println(student.getBranch());
				System.out.println(student.getAge());
				
				System.out.println("==============");
			}
		}
	}
}
