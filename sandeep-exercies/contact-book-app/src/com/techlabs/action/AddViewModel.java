package com.techlabs.action;

import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;

public class AddViewModel {

	private String firstName;
	private String lastName;
	private String mobile;
	private String email;
	private String contactId;
	
	@RequiredFieldValidator(message="must not be empty")
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@RequiredFieldValidator(message="must not be empty")
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@RequiredFieldValidator(message="must not be empty")
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@RequiredFieldValidator(message="must not be empty")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactId() {
		return contactId;
	}
	public void setContactId(String contactId) {
		this.contactId = contactId;
	}
	
	
}
