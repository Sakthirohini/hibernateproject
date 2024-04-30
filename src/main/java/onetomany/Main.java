package onetomany;

import java.util.ArrayList;
import java.util.List;

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
        
        Category c =  new Category();
        c.setcName("Clothing");
        s.save(c);
        
        Item i = new Item("Shirt");
        i.setC(c);
        s.save(i);
        
        Item i1 = new Item("Kurthi");
        i1.setC(c);
        s.save(i1);
        
        Item i2 = new Item("Saree");
        i2.setC(c);
        s.save(i2);
        
        
        
//      Category c =  new Category();
//      c.setcName("Electronics");
//      s.save(c);
//      
//      Item i = new Item("laptop");
//      i.setC(c);
//      s.save(i);
//      
//      Item i1 = new Item("Speaker");
//      i1.setC(c);
//      s.save(i1);
//      
//      Item i2 = new Item("Mic");
//      i2.setC(c);
//      s.save(i2);
        List<Item> li = new ArrayList<Item>();
        li.add(i);
        li.add(i1);
        li.add(i2);
        c.setItemlist(li);
        tr.commit();
        s.close();
	}

}
