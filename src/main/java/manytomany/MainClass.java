package manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	public static void main(String[] args) {
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=null;
		t=s.beginTransaction();
		
		Employee e=new Employee(101, "Roshani");
		Employee e1=new Employee(102, "Sonam");
		
		List<Employee> li=new ArrayList<Employee>();
		li.add(e);
		li.add(e1);
		              
		Project p1=new Project("Library Mgmt System");
//		p1.setEmpList(li);
		s.save(p1);
		Project p2=new Project("Student Mgmt System");
//		p2.setEmpList(li);
		s.save(p2);
		Project p3=new Project("Vehicle Mgmt System");
		p3.setEmpList(li);
		s.save(p3);	
		List<Project>ls=new ArrayList<Project>();
		ls.add(p1);
		//ls.add(p2);
		ls.add(p3);
		
		e.setPrList(ls);
		s.save(e);
		s.save(e1);
		t.commit();
		sf.close();
		
	}

}
