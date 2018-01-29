package com.techlabs.action.form;

public class ContactForm {

	private int id;

	private String email;
	private String mobile;
	private String city;
	private int pin;
	private String address;

	public ContactForm() {

	}

	public ContactForm(int id, String email, String mobile, String city, int pin, String address) {
		super();
		this.id = id;
		this.email = email;
		this.mobile = mobile;
		this.city = city;
		this.pin = pin;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int contactid) {
		this.id = contactid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
