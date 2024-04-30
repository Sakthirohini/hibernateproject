package onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) 
	
	{
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session s=sf.openSession();
        Transaction tr=null;
        tr=s.beginTransaction();
        
        Question q = new Question();
        q.setQname("What is java?");
        Answer a = new Answer(101, "Programming Language");
        q.setA1(a);
        s.save(q);
        s.save(a);
        tr.commit();
        System.out.println("Record Inserted Successfully");
        s.close();

	}

}
