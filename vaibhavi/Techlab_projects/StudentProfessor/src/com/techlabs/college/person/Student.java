package com.techlabs.college.person;

import com.techlabs.college.branch.Branch;

public class Student extends Person {

	private Branch branch;

	public Student(int id, String address, String dob, Branch Branch, Branch branch) {
		super(id, address, dob);
		this.branch = branch;

	}

	public Branch getBranch() {
		return branch;
	}

}
