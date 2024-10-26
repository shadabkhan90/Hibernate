package OneToMany;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App1 {
	public static void main(String[] args) {
		
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory factory  = c.buildSessionFactory();
		
		Question1 q1 = new Question1();
		q1.setQuesId(301);
		q1.setQues("tell me about yourself");
		
		
		
		Answer1 a = new Answer1();
		a.setAnsId(401);
		a.setAns("my name is shadab ");
		a.setQues(q1);
		
		Answer1 a1 = new Answer1();
		a1.setAnsId(402);
		a1.setAns("i am from modinagar ghaziabad ");
		a1.setQues(q1);
		
		Answer1 a2 = new Answer1();
		a2.setAnsId(403);
		a2.setAns("i have done java");
		a1.setQues(q1);
		
		
		
		
		List<Answer1> list  = new ArrayList<Answer1>();
		list.add(a);
		list.add(a1);
		list.add(a2);
		
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		s.save(a1);
		s.save(a2);
		s.save(a);
		s.save(q1);
		
		tx.commit();
		
		s.close();
		
		
	}

}
