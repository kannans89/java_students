package com.techlabs.action.form;

import java.util.Date;

import com.techlabs.entities.User;

public class UserForm {
	private int id;
	private String name;
	private Date dob;
	private char gender;
	private char isMarried;
	private char status;
	private String password;
	private String newPassword;
	private UserType userType;
	private ContactForm contact;

	public UserForm() {
		contact = new ContactForm();
	}

	public UserForm(int id, String name, String password, String newPassword, UserType userType) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.newPassword = newPassword;
		this.userType = userType;
	}

	public void fetchContactDetails(User user) {
		this.id = user.getId();
		this.contact.setMobile(user.getContact().getMobile());
		this.contact.setEmail(user.getContact().getEmail());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public char getIsMarried() {
		return isMarried;
	}

	public void setIsMarried(char isMarried) {
		this.isMarried = isMarried;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public ContactForm getContact() {
		return contact;
	}

	public void setContact(ContactForm contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return name;
	}

}
