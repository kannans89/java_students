package com.techlabs.contactbook.model;
import java.io.Serializable;
import java.util.UUID;
@SuppressWarnings("serial")
public class Person implements Serializable{
	private String firstName;
	private String lastName;
	private String mobNo;
	private String emailId;
	private String contactId;

	public Person()
	{
		this.contactId =UUID.randomUUID().toString();
	}	
	public String getContactId()
	{	
		return contactId;
	}	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getLastName()
	{
		return lastName;
	}
	
	public String getMobNo()
	{
		return mobNo;
	}
	
	public String getEmailId()
	{
		return emailId;
	}
}