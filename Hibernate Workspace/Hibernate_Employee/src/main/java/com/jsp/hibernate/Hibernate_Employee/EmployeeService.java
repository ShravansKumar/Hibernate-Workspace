package com.jsp.hibernate.Hibernate_Employee;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeService {

	public Session getSession() {

		Configuration cfg=new Configuration().configure().addAnnotatedClass(Employee.class);


		SessionFactory sf=cfg.buildSessionFactory();
		Session session =sf.openSession();
		return session;


	}

	Scanner scanner = new Scanner(System.in);
	// Add Employee
	public void addEmployee() {
		Session session=getSession();
		Transaction trans= session.beginTransaction();
		System.out.print("Enter employee ID: ");
		int employeeId = scanner.nextInt();
		scanner.nextLine(); 
		System.out.print("Enter employee name: ");
		String employeeName = scanner.next();
		System.out.print("Enter employee email: ");
		String employeeEmail = scanner.next();
		System.out.print("Enter employee address: ");
		String employeeAddress = scanner.next();

		Employee employee = new Employee();
		employee.seteId(employeeId);
		employee.seteName(employeeName);
		employee.seteEmail(employeeEmail);
		employee.seteAddress(employeeAddress);
		session.save(employee);
		trans.commit();

		System.out.println("    Employee added successfully.    ");
		session.close();



	}


	//Find Employee
	public void   findEmployeeById()
	{
		System.out.println("Enter the EmployeeId  mone !");
		int  employeeId=scanner.nextInt();
		Session session=getSession();
		Employee emp = session.get(Employee.class, employeeId);

		System.out.println(emp);
		System.out.println("Employee found");

	}

	//update Employee
	public void updateEmployeeById()
	{
		Session session=getSession();
		Transaction trans= session.beginTransaction();
		System.out.println("Enter The Employee id vavee ");
		int employeeId=scanner.nextInt();
		Employee emp = getSession().get(Employee.class, employeeId);
		System.out.println("Enter the Employee Mail id to be updated !");

		String employeeEmail=scanner.next();
		emp.seteEmail(employeeEmail); 


		System.out.println("Enter The Employee Address to be updated ");
		String employeeAddress=scanner.next();

		emp.seteAddress(employeeAddress);
		session.update(emp);

		session.save(emp);
		trans.commit();
		session.close();
		System.out.println("Updated successfully !");
	}



	//Delete employee

	public void deleteEmployeeById() 
	{

		Session session=getSession();
		Transaction trans=session.beginTransaction();


		System.out.println("Enter Employee id to be deletd ");
		int employeeId=scanner.nextInt();
		Employee emp = session.get(Employee.class, employeeId);
		session.delete(emp);
		trans.commit();

		System.out.println("Deleted Succesfully ");



	}

}

























