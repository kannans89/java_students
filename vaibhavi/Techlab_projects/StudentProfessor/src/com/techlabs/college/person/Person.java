package com.techlabs.college.person;

public abstract class Person {

	private int id;
	private String address;
	private String dob;

	public Person(int id, String address, String dob) {
		super();
		this.id = id;
		this.address = address;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public String getDob() {
		return dob;
	}
}
