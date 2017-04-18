package com.onlinetutorialspoint.service;

import com.onlinetutorialspoint.dao.EmployeeDAO;
import com.onlinetutorialspoint.pojo.EmpCount;
import com.onlinetutorialspoint.pojo.Employee;
import com.onlinetutorialspoint.pojo.EmployeeDetails;

public class DBOperationEmp {
	
	public static void main(String[] args) {
		
		
	
		EmployeeDAO employeeDAO = new EmployeeDAO();
		Employee employee = new Employee();
		employee.setEmpName("Tejesh");
		employee.setEmpEmilID("TJ@gmail.com");
		employee.setCretedDate("22-10-1989");
		employee.setSubject("TestingEmail");
		employee = employeeDAO.addEmployee(employee);
		
		System.out.println(employee.getEmpID());
		
		
		EmployeeDetails employeeDetails = new EmployeeDetails();
		
		employeeDetails.setBody("This Mail Testing");
		employeeDetails.setCretedDate(employee.getCretedDate());
		employeeDetails.setEmpEmilID(employee.getEmpEmilID());
		employeeDetails.setEmpID(employee.getEmpID());
		
		employeeDetails = employeeDAO.addEmployeeDetails(employeeDetails);
		
		
		
		EmpCount empCount = new EmpCount();
		
		empCount.setCount(1);
		empCount.setEmpID(employee.getEmpID());
		
		employeeDAO.addEmployeecount(empCount);
		
		
		
		
		
		
	}

}
