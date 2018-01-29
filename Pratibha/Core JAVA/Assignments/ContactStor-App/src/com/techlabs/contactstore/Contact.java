package com.techlabs.contactstore;

public class Contact {
	
	private static int count;

	
	private int id;
	private String firstName;
	private String lastName;
	private String address;
	private String mobile;
	private int no;

	public Contact(int id, String firstName, String lastName, String address,
			String mobile) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.mobile = mobile;
		this.id = id+getCount();

	}

	public Contact( String firstName, String lastName, String address,
			String mobile,int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.mobile = mobile;
		this.id = id;

	}

	public int getId() {
		return id;

	}

	public int getno() {
		return no;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return this.mobile;

	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public static int getCount(){
		count+=1;
		return count;
	}
}
