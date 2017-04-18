package com.onlinetutorialspoint.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.onlinetutorialspoint.config.HibernateConnector;
import com.onlinetutorialspoint.pojo.EmpCount;
import com.onlinetutorialspoint.pojo.Employee;
import com.onlinetutorialspoint.pojo.EmployeeDetails;

public class EmployeeDAO {

	
	public Employee addEmployee(Employee employee) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateConnector.getInstance().getSession();
            System.out.println("session : "+session);
            transaction = session.beginTransaction();
            session.save(employee);
            transaction.commit();
            return employee;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } 
    }
	
	public EmployeeDetails addEmployeeDetails(EmployeeDetails employeeDetails) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateConnector.getInstance().getSession();
            System.out.println("session : "+session);
            transaction = session.beginTransaction();
            session.save(employeeDetails);
            transaction.commit();
            return employeeDetails;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } 
    }
	
	public EmpCount addEmployeecount(EmpCount empCount) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateConnector.getInstance().getSession();
            System.out.println("session : "+session);
            transaction = session.beginTransaction();
            session.save(empCount);
            transaction.commit();
            return empCount;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } 
    }
}
