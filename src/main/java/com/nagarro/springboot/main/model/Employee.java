package com.nagarro.springboot.main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee 
{
	@Id
	@Column(name="Emp_code")
	private int Emp_code;
	
	@Column(name="Emp_Name")
	private String Name;
	
	@Column(name="Emp_Loc")
	private String Loc;
	
	@Column(name="Emp_Email")
	private String Email;
	
	@Column(name="Emp_dob")
	private String Dob;

	public int getEmpcode() {
		return Emp_code;
	}

	public void setEmpcode(int empcode) {
		Emp_code = empcode;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getLoc() {
		return Loc;
	}

	public void setLoc(String loc) {
		Loc = loc;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getDob() {
		return Dob;
	}

	public void setDob(String dob) {
		Dob = dob;
	}

	public Employee() 
	{
	}
}
