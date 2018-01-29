package com.techlabs.college;

import java.util.Date;

public class Student extends Person {

	private BranchType branchType;

	public Student(int id, String address, Date dob, String name,
			BranchType branchType) {
		super(id, address, dob, name);
		this.branchType = branchType;
	}

	@Override
	public String toString() {
		return "Student [id= "+this.getId()+" Name= "+this.getName()+
				" Address= "+this.getAddress()+" branchType= " + branchType + "]";
	}

	public BranchType getBranchType() {
		return branchType;
	}

	public void setBranchType(BranchType branchType) {
		this.branchType = branchType;
	}
}
