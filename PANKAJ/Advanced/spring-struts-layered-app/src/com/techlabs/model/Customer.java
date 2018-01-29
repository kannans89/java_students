package com.techlabs.model;

public class Customer {
	private String firstName;
	private String lastName;
	
	public Customer(){
		System.out.println("In customer no-arg constr..");
	}

	public Customer(String firstName, String lastName) {
		System.out.println("In Customer constructor with " + firstName + " "
				+ lastName);
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		System.out.println("In cust getFirstName " + firstName);
		return firstName;
	}

	public void setFirstName(String firstName) {
		System.out.println("In cust setFirstName" + firstName);
		this.firstName = firstName;
	}

	public String getLastName() {
		System.out.println("In cust getLastName " + lastName);
		return lastName;
	}

	public void setLastName(String lastName) {
		System.out.println("In cust getLastName " + lastName);
		this.lastName = lastName;
	}
}
