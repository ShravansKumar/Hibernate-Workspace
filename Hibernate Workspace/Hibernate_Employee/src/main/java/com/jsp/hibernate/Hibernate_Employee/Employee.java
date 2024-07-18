package com.jsp.hibernate.Hibernate_Employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
  
  
  @Id
  
  private int eId;
  private String eName;
  private String eEmail;
  private String eAddress;
  public int geteId() {
    return eId;
  }
  public void seteId(int eId) {
    this.eId = eId;
  }
  public String geteName() {
    return eName;
  }
  public void seteName(String eName) {
    this.eName = eName;
  }
  public String geteEmail() {
    return eEmail;
  }
  public void seteEmail(String eEmail) {
    this.eEmail = eEmail;
  }
  public String geteAddress() {
    return eAddress;
  }
  public void seteAddress(String eAddress) {
    this.eAddress = eAddress;
  }
  @Override
  public String toString() {
    return "Employee [eId=" + eId + ", eName=" + eName + ", eEmail=" + eEmail + ", eAddress=" + eAddress + "]";
  }
  
  
  

}