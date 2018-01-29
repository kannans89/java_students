package com.techlabs.college;

import java.util.Date;

public class Person {
	private int id;
	private String name;
	private String address;
	private Date dob;

	public Person(int id, String address, Date dob,String name) {
		this.id = id;
		this.address = address;
		this.dob = dob;
		this.setName(name);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDate() {
		return dob;
	}

	public void setDate(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", address=" + address + ", dob=" + dob
				+ "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
