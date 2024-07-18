package com.jsp.hibernate.Hibernateproject_OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Passport {

	@Id
	private int pp_id;
	public int getPp_id() {
		return pp_id;
	}
	public void setPp_id(int pp_id) {
		this.pp_id = pp_id;
	}
	public long getPp_num() {
		return pp_num;
	}
	public void setPp_num(long pp_num) {
		this.pp_num = pp_num;
	}
	private long pp_num;
	@Override
	public String toString() {
		return "Passport [pp_id=" + pp_id + ", pp_num=" + pp_num + "]";
	}



}
