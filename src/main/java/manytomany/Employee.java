package manytomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
@Id
private int eId;
private String eNam;
@ManyToMany
private List<Project> prList;

public Employee(int eId, String eNam) {
	super();
	this.eId = eId;
	this.eNam = eNam;
}
public int geteId() {
	return eId;
}
public void seteId(int eId) {
	this.eId = eId;
}
public String geteNam() {
	return eNam;
}
public void seteNam(String eNam) {
	this.eNam = eNam;
}

public List<Project> getPrList() {
	return prList;
}
public void setPrList(List<Project> prList) {
	this.prList = prList;
}
@Override
public String toString() {
	return "Employee [eId=" + eId + ", eNam=" + eNam + "]";
}


}
