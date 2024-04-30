package com.hibernateproject;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	SessionFactory sf=new Configuration().configure().buildSessionFactory();
        Session s=sf.openSession();
        Transaction tr=null;
        tr=s.beginTransaction();
        
//        Line 22 to 27 for insert
//        Book b = new Book();
//        b.setBookname("Python");
//        b.setBookauthor("ATHY");
//        b.setBookprice(800);
//        s.save(b);
//        Book b1 = new Book("C", "Balaguru",600);
//        s.save(b1);
        
//        Line 30 to 34 for update
//        Book b = new Book();
//        b.setBookid(2);
//        b.setBookname("Angular");
//        b.setBookauthor("Robert");
//        b.setBookprice(500);
//        s.update(b);
        
        
//        Line 42 to 47 for Display Data
//        Query q=s.createQuery("from Book");
//        List<Book> li=q.list();
//        for(Book bk:li)
//        {
//            System.out.println(bk);
//        }
        
        
        
//        Line 52 to 54 for delete
//        Book b = new Book();
//        b.setBookid(4);
//        s.delete(b);
//        
        
        
//        Query q=s.createQuery("select avg(bookprice) from Book");  
//        List<Integer> list=q.list();  
//        System.out.println(list.get(0)); 
//        
//        Query q1=s.createQuery("select count(*) from Book");  
//        List<Integer> list1=q1.list();  
//        System.out.println(list1.get(0)); 
        
        
//        Query q2=s.createQuery("select  b.bookname, count(b.bookid) from Book as b group by bookname");  
//        List<Object[]> li1=q2.list();
//        li1.forEach(item-> System.out.println("bookname : "+item[0]+"\t count : "+item[1]));
//        
//        Query query = s.createQuery("select bookprice,count(bookprice) from Book group by bookprice having bookPrice>300");
//        List<Object[]> li = query.list();
//        li.forEach(item-> System.out.println("bPrice : "+item[0]+"\t count : "+item[1]));
//        
        List count=s.getNamedQuery("getBookCount").list();
        System.out.println("Total No Of Books: "+count.get(0));
        
        Query q3=s.getNamedQuery("findBookByName");
        q3.setString("bookname", "Python");
        List<Book> list = q3.list();
        
      for(Book bk:list)
      {
          System.out.println(bk);
      }
//        for(int i=0;i<list.size();i++)
//        {
//           System.out.println("Id :"+list.get(i).getBookid() +"\nName : "+list.get(i).getBookname());
//      }
        
        tr.commit();
        s.close();
        
        
    }
}
