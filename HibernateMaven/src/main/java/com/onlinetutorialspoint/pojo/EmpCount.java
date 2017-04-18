package com.onlinetutorialspoint.pojo;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empcount", catalog = "onlinetutorialspoint"
)
public class EmpCount {
	
	
	private Integer empCID;
	private Integer empID;
	private Integer count;
	
	 @Id
	 @GeneratedValue(strategy = IDENTITY)

	@Column(name = "empCID", unique = true, nullable = false)
	public Integer getEmpCID() {
		return empCID;
	}
	public void setEmpCID(Integer empCID) {
		this.empCID = empCID;
	}
	public Integer getEmpID() {
		return empID;
	}
	public void setEmpID(Integer empID) {
		this.empID = empID;
	}
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}

}
