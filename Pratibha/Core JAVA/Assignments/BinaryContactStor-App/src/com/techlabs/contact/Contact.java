package com.techlabs.contact;

import java.io.Serializable;

public class Contact implements Serializable {

	private long id;
	private String fName;
	private String lname;
	private String emailId;
	private long phoneNo;

	public Contact(String fName, String lname, String emailId, long phoneNo) {
		this(0, fName, lname, emailId, phoneNo);
	}

	public Contact(long id, String fName, String lname, String emailId,
			long phoneNo) {
		this.id = id;
		this.fName = fName;
		this.lname = lname;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFName() {
		return fName;
	}

	public void setFName(String fName) {
		this.fName = fName;
	}

	public String getLName() {
		return lname;
	}

	public void setLName(String lname) {
		this.lname = lname;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
}
