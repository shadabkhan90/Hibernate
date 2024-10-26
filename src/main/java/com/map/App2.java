package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App2 {

	public static void main(String[] args) {
		
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory factory  = c.buildSessionFactory();
		
		Question q = new Question();
		q.setQuesId(101);
		q.setQuestion("waht is your name");
		
		
		Answer a = new Answer();
		a.setAnsId(201);
		a.setAnswers("my name is shadab");
		
		q.setAns(a);
		
		Question q1 = new Question();
		q1.setQuesId(102);
		q1.setQuestion("how are you");
		
		Answer a1 = new Answer();
		a1.setAnsId(111);
		a1.setAnswers("my name is shadab");
		
		
		q1.setAns(a1);
		
		Session s = factory.openSession();
		
		Transaction tx = s.beginTransaction();
		
		s.save(q);
		s.save(q1);
		s.save(a);
		s.save(a1);
		
		tx.commit();
		
		s.close();
		factory.close();
		

	}

}
