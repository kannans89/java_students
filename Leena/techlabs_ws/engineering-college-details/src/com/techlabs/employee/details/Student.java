package com.techlabs.employee.details;
import com.techlabs.departments.Branch;

public class Student extends Person{
	public String details;
    private Branch branch;
	
	public Student(int id,String address,String DOB,Branch branch){
		super(id,address,DOB);
		this.branch=branch;
	}
	
	public Branch getBranch(){
		return this.branch;
	}
	
	@Override
	public String toString(){
		details="your id is :"+this.getID()+" Address: "+this.getAddress()+" Dob is : "+this.getDOB()+" Branch is :"+this.getBranch();
		return details;
	}

}
