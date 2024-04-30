package com.hibernateproject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.NamedQueries;



@NamedQueries( 
        { 
            @NamedQuery(name="findBookById", query = "from Book b where b.bookid=:bookid"),
            @NamedQuery(name="findBookByName", query = "from Book b where b.bookname=:bookname"),
            @NamedQuery(name = "getBookCount",query = "select count(1) from Book")
        }
        )
@Entity
public class Book 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bookid;
	private String bookname;
	private String bookauthor;
	private int bookprice;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookauthor() {
		return bookauthor;
	}
	public void setBookauthor(String bookauthor) {
		this.bookauthor = bookauthor;
	}
	public int getBookprice() {
		return bookprice;
	}
	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", bookauthor=" + bookauthor + ", bookprice="
				+ bookprice + "]";
	}
	public Book(String bookname, String bookauthor) {
		super();
		
		this.bookname = bookname;
		this.bookauthor = bookauthor;
		
	}
	public Book(String bookname, String bookauthor, int bookprice) {
		super();
		this.bookname = bookname;
		this.bookauthor = bookauthor;
		this.bookprice = bookprice;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
