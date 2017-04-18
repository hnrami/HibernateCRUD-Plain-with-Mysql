package com.onlinetutorialspoint.pojo;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employeeDetails", catalog = "onlinetutorialspoint"
)
public class EmployeeDetails {

	
	
	private Integer empDID;
	private Integer empID;
    private String  empEmilID;
    private String  body;
    private String  cretedDate;
    
    @Id
    @GeneratedValue(strategy = IDENTITY)

    @Column(name = "empDID", unique = true, nullable = false)
	public Integer getEmpDID() {
		return empDID;
	}
	public void setEmpDID(Integer empDID) {
		this.empDID = empDID;
	}
	public Integer getEmpID() {
		return empID;
	}
	public void setEmpID(Integer empID) {
		this.empID = empID;
	}
	public String getEmpEmilID() {
		return empEmilID;
	}
	public void setEmpEmilID(String empEmilID) {
		this.empEmilID = empEmilID;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getCretedDate() {
		return cretedDate;
	}
	public void setCretedDate(String cretedDate) {
		this.cretedDate = cretedDate;
	}
	
}
