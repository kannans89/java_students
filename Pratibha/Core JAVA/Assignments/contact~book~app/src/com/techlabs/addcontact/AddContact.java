package com.techlabs.addcontact;

public class AddContact {
	private String fname;
	private String lname;
	private long contact;
	private String email;

	public AddContact(String fname, String lname, long contact, String email) {
		this.fname = fname;
		this.lname = lname;
		this.contact = contact;
		this.email = email;

	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
