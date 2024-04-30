package onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer 
{
	 @Id
	    private int ansid;
	    private String ansname;
		public int getAnsid() {
			return ansid;
		}
		public void setAnsid(int ansid) {
			this.ansid = ansid;
		}
		public String getAnsname() {
			return ansname;
		}
		public void setAnsname(String ansname) {
			this.ansname = ansname;
		}
		@Override
		public String toString() {
			return "Answer [ansid=" + ansid + ", ansname=" + ansname + "]";
		}
		public Answer(int ansid, String ansname) {
			super();
			this.ansid = ansid;
			this.ansname = ansname;
		}
	    
	    

}
