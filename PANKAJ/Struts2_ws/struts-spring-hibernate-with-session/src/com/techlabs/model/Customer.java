package com.techlabs.model;

public class Customer {
	String name;
	int id;
	String location;

	Customer() {
		System.out.println("In cust no-arg constr");
	}

	public Customer(int id, String name, String location) {
		System.out.println("In cust arg constr");
		this.id = id;
		this.name = name;
		this.location = location;
	}

	public String getName() {
		System.out.println("In Cust getName() " + name);
		return name;
	}

	public void setName(String name) {
		System.out.println("In Cust setName() " + name);
		this.name = name;
	}

	public int getId() {
		System.out.println("In Cust getId() " + id);
		return id;
	}

	public void setId(int id) {
		System.out.println("In Cust setId() " + id);
		this.id = id;
	}

	public String getLocation() {
		System.out.println("In Cust getLoc() " + location);
		return location;
	}

	public void setLocation(String location) {
		System.out.println("In setLoc() " + location);
		this.location = location;
	}
}
