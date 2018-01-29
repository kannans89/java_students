package com.techlabs.contactbook;

public class Book {
	private static int count;
	{
		count += 1;
	}
	private int id;
	private String firstName;
	private String lastName;
	private String address;
	private Number contact;
	private int no;
	private LoadData loadData;

	public Book(String firstName, String lastName, String address,
			Number contact) {
		loadData = LoadData.getLoadData();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.contact = contact;
		this.id = Book.count + loadData.getOldId();

	}

	public Book(int id, String firstName, String lastName, String address,
			Number contact) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.contact = contact;
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

	public Number getContact() {
		return contact;

	}

	public void setContact(Number contact) {
		this.contact = contact;
	}

}
