package com.techlabs.engineeringcollege.person;

import com.techlabs.engineeringcollege.Branch;

public class Student extends Person {
	// constructor
	public Student(int id, String name, String address, String dateOfBirth,
			Branch department) {
		super(id, name, address, dateOfBirth);
		studentDepartment = department;
	}

	// methods
	public Branch getStudentDepartment() {
		return studentDepartment;
	}

	@Override
	public String toString() {
		return "Student Branch:-" + getStudentDepartment() + "\nID :- "
				+ getId() + "\nName :-" + getName() + "\nAddress:-"
				+ getAddress() + "\nDate of Birth :- " + getDOB()
				+ "\n=============================================";
	}

	// instance variables
	private Branch studentDepartment;
}
