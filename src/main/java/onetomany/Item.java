package onetomany;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Item 
{
@Id
@GeneratedValue(strategy =GenerationType.AUTO)
private int itemid;
private String itemname;

@ManyToOne
private Category c;


public Category getC() {
	return c;
}
public void setC(Category c) {
	this.c = c;
}
public Item() {
	super();
	// TODO Auto-generated constructor stub
}
public int getItemid() {
	return itemid;
}
public void setItemid(int itemid) {
	this.itemid = itemid;
	
	
}
public String getItemname() {
	return itemname;
}
public void setItemname(String itemname) {
	this.itemname = itemname;
}
@Override
public String toString() {
	return "Item [itemid=" + itemid + ", itemname=" + itemname + "]";
}
public Item(String itemname) {
	super();
	this.itemname = itemname;
}


}
