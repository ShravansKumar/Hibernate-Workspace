package com.jsp.hibernate.Hibernateproject_OneToMany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		Passport pp= new Passport();

		pp.setPp_id(121);
		pp.setPp_num(342235753);


		Person p =new Person();
		p.setP_id(101);
		p.setP_name("Fury");

		//Adding the mapped object into the person

		p.setPassport(pp);




		Configuration cfg=new Configuration().configure().addAnnotatedClass(Passport.class).addAnnotatedClass(Person.class);


		SessionFactory sf=cfg.buildSessionFactory();
		Session session =sf.openSession();
		Transaction trans =session.beginTransaction();

		session.save(p);
		session.save(pp);
		trans.commit();
		session.close();
	}
}
