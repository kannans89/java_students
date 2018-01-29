package com.techlabs.college.persons;

import com.techlabs.college.Branch;

public class Student extends Person{
	Branch branchOfStudent;

	public Student(int id, String name, String address, String dob,
			Branch branchOfStudent) {
		super(id, name, address, dob);
		this.branchOfStudent = branchOfStudent;
	}
	
	

}
