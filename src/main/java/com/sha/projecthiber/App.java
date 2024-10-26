package com.sha.projecthiber;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		Configuration cf = new Configuration();
		cf.configure("hibernate.cfg.xml");
		SessionFactory factory = cf.buildSessionFactory();

		Students st = new Students();
		st.setName("bimla");
		st.setCity("delhi");
		System.out.print(st);
		
		Certificate cf1 = new Certificate();
		cf1.setName("hibernet");
		cf1.setDuration(1.5);
		st.setCerti(cf1);
		
		Students st1 = new Students();
		st1.setName("kamla");
		st1.setCity("bht dur");
		System.out.print(st1);
		
		Certificate cf2 = new Certificate();
		cf2.setName("hibernet");
		cf2.setDuration(1.5);
		st1.setCerti(cf2);
		
		

//		StudentAdress StA = new StudentAdress();
//		StA.setStreet("mauhalla");
//		StA.setCity("mumbai");
//		StA.setOpen(true);
//		StA.setX(222222);
//		StA.setAddedDate(new Date(0));
//		System.out.print(StA);

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		session.save(st);
		session.save(st1);   
//		session.save(StA);
		

		tx.commit();

		session.close();
		System.out.print("done......");
		

	}
}
