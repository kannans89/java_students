package com.techlabs.employee.details;

public class Person {
	
	private int id;
	private String address;
	private String dateOfBirth;
	
	public Person(int id,String address,String dob){
		this.id=id;
		this.address=address;
		this.dateOfBirth=dob;
	}
	
	public int getID(){
		return id;
	}
	
	public String getAddress(){
		return address;
	}
	
	public String getDOB(){
		return dateOfBirth;
	}


}
