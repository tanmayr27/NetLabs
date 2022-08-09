package com.training;

import org.hibernate.Session;

import Employee;

public class Program {
	public static void main(String[] args) {
		Session session = HibernatePersistance.getSessionFactory()
				.openSession();
		
		session.beginTransaction();
		Employee employee = new Employee();
		
		// Make sure employee for storing in database
		employee.setId(1);
		employee.setFirstname("");
		employee.setLastname("");
		
		// save employee to database
		Integer employeeId = (Integer) session.save(employee);
		session.getTransaction().commit();
		
		// get data from database
		employee = (Employee) session.get(Employee.class, employeeId);
		System.out.println(employee);
		
		// close session
		HibernatePersistance.shutdown();
	}
}
