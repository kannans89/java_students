package com.techlabs.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
public class Contact {

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "user"))
	@Id
	@GeneratedValue(generator = "generator")
	private int id;

	private String email;
	private String mobile;
	private String city;
	private int pin;
	private String address;

	@OneToOne
	User user;

	public Contact() {

	}

	public Contact(String email, String mobile, String city, int pin, String address, User user) {
		this.email = email;
		this.mobile = mobile;
		this.city = city;
		this.pin = pin;
		this.address = address;
		this.user = user;
	}

	public Contact(int id, String email, String mobile, String city, int pin, String address, User user) {
		this.id = id;
		this.email = email;
		this.mobile = mobile;
		this.city = city;
		this.pin = pin;
		this.address = address;
		this.user = user;
	}

	/*
	 * void fetchContactDetails(String email, String mobile, String city, int
	 * pin, String address) { this.email = email; this.mobile = mobile;
	 * this.city = city; this.pin = pin; this.address = address; }
	 */

	/*
	 * public void fetchContactDetails(ContactForm contactForm) { id =
	 * contactForm.getId(); email = contactForm.getEmail(); mobile =
	 * contactForm.getMobile(); city = contactForm.getCity(); pin =
	 * contactForm.getPin(); address = contactForm.getAddress(); }
	 */

	void update(String mobile, String email) {
		this.mobile = mobile;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getMobile() {
		return mobile;
	}

	public String getCity() {
		return city;
	}

	public int getPin() {
		return pin;
	}

	public String getAddress() {
		return address;
	}

	public User getUser() {
		return user;
	}

}
