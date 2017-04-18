package com.onlinetutorialspoint.pojo;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "employee", catalog = "onlinetutorialspoint"
)
public class Employee implements java.io.Serializable {
	
	
	
	private Integer empID;
    private String empName;
    private String empEmilID;
    private String subject;
    private String cretedDate;
    
    
   
    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "empID", unique = true, nullable = false)
	public Integer getEmpID() {
		return empID;
	}
	public void setEmpID(Integer empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpEmilID() {
		return empEmilID;
	}
	public void setEmpEmilID(String empEmilID) {
		this.empEmilID = empEmilID;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getCretedDate() {
		return cretedDate;
	}
	public void setCretedDate(String cretedDate) {
		this.cretedDate = cretedDate;
	}
    

}
