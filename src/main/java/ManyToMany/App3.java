package ManyToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App3 {

	public static void main(String[] args) {
		
		
		Configuration c = new Configuration();
		c.configure("hibernate.cfg.xml");
		SessionFactory factory  = c.buildSessionFactory();
		
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		
		e1.setEmp_id(231);
		e1.setEmp_name("Ram");
		
		
		e2.setEmp_id(232);
		e2.setEmp_name("Shyam");
		
		
		
		Project p1 = new Project();
		Project p2 = new Project();
		
		p1.setPro_id(321);
		p1.setPro_name("chatbot");
		
		p2.setPro_id(322);
		p2.setPro_name("school management");
		
		
		List<Emp> l1 = new ArrayList<Emp>();
		List<Project> l2  = new ArrayList<Project>();
		
		l1.add(e1);
		l1.add(e2);
		l2.add(p1);
		l2.add(p2);
		
		
		e1.setPro(l2);
		p1.setEmp(l1);
		
		
		
		
		Session s1 = factory.openSession();
		Transaction tx = s1.beginTransaction();
		
		
		s1.save(e1);
		s1.save(e2);
		s1.save(p1);
		s1.save(p2);
		
		tx.commit();
		
		
		
		
	    s1.close();

	}

}
