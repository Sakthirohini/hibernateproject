package onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Question 
{
	@Id                        // primary key 
    @GeneratedValue(strategy =GenerationType.AUTO)        // auto increment qustion id 
    private int qid;
    private String qname;
    
    @OneToOne                        // one answer for one question
    @JoinColumn(name = "ansid")        // object creation
    private Answer a1 ;

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}

	public String getQname() {
		return qname;
	}

	public void setQname(String qname) {
		this.qname = qname;
	}

	public Answer getA1() {
		return a1;
	}

	public void setA1(Answer a1) {
		this.a1 = a1;
	}

	public Question(String qname, Answer a1) {
		super();
		this.qname = qname;
		this.a1 = a1;
	}

	@Override
	public String toString() {
		return "Question [qid=" + qid + ", qname=" + qname + ", a1=" + a1 + "]";
	}

}
