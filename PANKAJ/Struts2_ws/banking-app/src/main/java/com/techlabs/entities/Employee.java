package com.techlabs.entities;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Employee extends User {

	private String qualification;
	private String department;

	public Employee() {
		super();
	}

	public Employee(int id, String name, Date dob, char gender, char isMarried, String password, char status,
			String qualification, String department, Contact contact) {
		super(id, name, dob, gender, isMarried, password, status, contact);
		this.qualification = qualification;
		this.department = department;
	}

	public String getQualification() {
		return qualification;
	}

	public String getDepartment() {
		return department;
	}

	public void update(String mobile, String email, String qualification, String dept) {
		super.update(mobile, email);
		this.qualification = qualification;
		this.department = dept;
	}

}
