package com.jsp.hibernate.Hibernate_Demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int sId;
	private String sName;
	private int sAge;



	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sAge=" + sAge + "]";
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getsAge() {
		return sAge;
	}
	public void setsAge(int sAge) {
		this.sAge = sAge;
	}

}