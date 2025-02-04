package com.jsp.hibernate.Hibernateproject_OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



@Entity
public class Person {
    @Id
	private  int p_id;
	private String p_name;
	
	
	@OneToOne
	
	private Passport passport;


	public int getP_id() {
		return p_id;
	}


	public void setP_id(int p_id) {
		this.p_id = p_id;
	}


	public String getP_name() {
		return p_name;
	}


	public void setP_name(String p_name) {
		this.p_name = p_name;
	}


	public Passport getPassport() {
		return passport;
	}


	public void setPassport(Passport passport) {
		this.passport = passport;
	}


	@Override
	public String toString() {
		return "Person [p_id=" + p_id + ", p_name=" + p_name + ", passport=" + passport + "]";
	}
	
	


	
	
	
	
}
