package com.techlabs.entities;

public class Employee {

	private String name;
	private String email;
	private String address;

	public Employee() {
		name = email = address = null;
	}

	public Employee(String name) {
		this.name = name;
		email = address = null;
	}

	public Employee(String name, String email) {
		this.name = name;
		this.email = email;
		address = null;
	}

	public Employee(String name, String email, String address) {
		this.name = name;
		this.email = email;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", email=" + email + ", address="
				+ address + "]";
	}
	
	
}
