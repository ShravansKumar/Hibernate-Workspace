package com.jsp.hibernate.Hibernate_Demo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
	public static void main( String[] args )
	{
		Configuration cfg=new Configuration();
		cfg.configure();//------>read and load the hibernate.cfg.xml
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session session =sf.openSession();

		Transaction trans = session.beginTransaction();

		//		Student s1 =new Student();
		//		s1.setsAge(21);
		//		s1.setsId(101);
		//		s1.setsName("John");
		//
		//		Student s2 =new Student();
		//		s2.setsAge(20);
		//		s1.setsId(105);
		//		s1.setsName("Anne");
		//		
		//		Student s3 =new Student();
		//		s3.setsAge(19);
		//		s3.setsId(500);
		//		s3.setsName("Victor");
		//
		//		List<Student> l=new ArrayList<Student>();				
		//		l.add(s1);
		//		l.add(s2);
		//		l.add(s3);
		//		for(Student s:l) {    
		//			session.save(s);
		//		}




		//get()

		Student student1 =session.get(Student.class,500);
		System.out.println(student1);

		//load()


		Student student2 =session.load(Student.class,105);
		System.out.println(student2);


		//fetching the existing object
		Student student= session.get(Student.class,105);


		//updating the object found
		Student student3=session.get(Student.class, 101);
		student.setsName("student4");
		session.update(student3);



		//deleting the object found
		Student student5= session.get(Student.class,101);
		session.delete(student5);

		trans.commit();
		session.close();



		//<-------business logic ---->save/update/remove/create


	}
}
