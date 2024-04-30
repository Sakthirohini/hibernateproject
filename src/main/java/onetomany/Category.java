package onetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category 
{
	  @Id
	    @GeneratedValue
	    private int cId;
	    private String cName;
	    
	    @OneToMany
	    private List<Item> itemlist;

		public Category() {
			super();
			// TODO Auto-generated constructor stub
		}

		public int getcId() {
			return cId;
		}

		public void setcId(int cId) {
			this.cId = cId;
		}

		public String getcName() {
			return cName;
		}

		public void setcName(String cName) {
			this.cName = cName;
		}

		public List<Item> getItemlist() {
			return itemlist;
		}

		public void setItemlist(List<Item> itemlist) {
			this.itemlist = itemlist;
		}

		@Override
		public String toString() {
			return "Category [cId=" + cId + ", cName=" + cName + ", itemlist=" + itemlist + "]";
		}

		

}
