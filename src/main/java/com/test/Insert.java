package com.test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.hibernateUtil.HibernateUtil;
import com.model.Student;

public class Insert {

	public static void main(String[] args) {
		
		  SessionFactory factory=HibernateUtil.getSessionFactory();
		
		Session session=HibernateUtil.getSession();
		try(factory;session){
			session.beginTransaction();
//			Student student=new Student(1, "Sujit", "sujit@gmail.com", 22, "Mechanical Engg");
			Student student=new Student(2, "daya", "daya@gmail.com", 42, "Mechanical");
			session.save(student);
			session.getTransaction().commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		 /*
		 StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
		    Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
		  
		SessionFactory factory = meta.getSessionFactoryBuilder().build();  
		Session session = factory.openSession();  
		Transaction t = session.beginTransaction();   
		            
		    Student student=new Student();    
		    student.setId(1);
		    student.setName("Sujit");
		    student.setEmail("sujit@gmail.com");
		    student.setAge(22);
		    student.setBranch("Mech");
		         
		    session.save(student);  
		    t.commit();  
		    System.out.println("successfully saved");    
		    factory.close();  
		    session.close();   
		    */ 
	}
}
