package com.techlab.node;

public class Student implements Runnable{
     private int batchNo;
     private String firstName;
     private String lastName;
	
     public Student(int batchNo, String firstName, String lastName) {
		this.batchNo=batchNo;
		this.firstName=firstName;
		this.lastName=lastName;
	}
     
     
     public int getBatchNo() {
		return batchNo;
	}
	public void setBatchNo(int batchNo) {
		this.batchNo = batchNo;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
