package manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	@Id
	@GeneratedValue
	
	private int pId;
	private String pTitle;
	@ManyToMany
	private List<Employee> empList;
	
	public Project(String pTitle) {
		super();
		//this.pId = pId;
		this.pTitle = pTitle;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpTitle() {
		return pTitle;
	}
	public void setpTitle(String pTitle) {
		this.pTitle = pTitle;
	}
	
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	@Override
	public String toString() {
		return "Project [pId=" + pId + ", pTitle=" + pTitle + "]";
	}
	
	

}
