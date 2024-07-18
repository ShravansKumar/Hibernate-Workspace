package com.jsp.hibernate.Hibernate_Employee;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
  
  static Scanner sc=new Scanner(System.in);
    public static void main( String[] args )
    {
       EmployeeService s=new EmployeeService();
       
       System.out.println("1.addEmployee\n2.findEmployeeById\n3.updateEmployeeById\n4.deleteEmployeeById\n choose any option");
       
       int selection=sc.nextInt();
       
       switch (selection) {
  case 1:s.addEmployee();break;
  case 2:s.findEmployeeById();break;
  case 3:s.updateEmployeeById();break;
  case 4:s.deleteEmployeeById();break;
  default:System.out.println("No such selection present");
    break;
  }
       
      
       
       //s.addEmployee();
       //s.findEmployeeById();
       //s.updateEmployeeById();
       //s.deleteEmployeeById();
    }
}
