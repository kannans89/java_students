package com.techlabs.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class User {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private String name;
	private Date dob;
	private char gender;
	private char isMarried;
	private String password;
	private char status;

	@OneToOne(cascade = CascadeType.ALL)
	// @PrimaryKeyJoinColumn
	private Contact contact;

	public User() {

	}

	public User(String name, Date dob, char gender, char isMarried, String email, String mobile, String city, int pin,
			String address) {
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.isMarried = isMarried;
		this.status = 'I';
		this.contact = new Contact(email, mobile, city, pin, address, this);
		generateOTP();
	}

	public User(int id, String name, Date dob, char gender, char isMarried, String password, char status,
			Contact contact) {
		this.id = id;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
		this.isMarried = isMarried;
		this.password = password;
		this.status = status;
		this.contact = contact;
	}

	public boolean validate(String password) {
		if (this.password.equals(password))
			return true;
		return false;
	}

	void update(String mobile, String email) {
		this.getContact().update(mobile, email);
	}

	public void changePassword(String newPassword) {
		this.password = newPassword;
		if (this.status == 'I')
			this.status = 'A';
	}

	public boolean validateDetails(String mobile, String email) {
		if (getContact().getMobile().equalsIgnoreCase(mobile) & getContact().getEmail().equalsIgnoreCase(email))
			return true;
		return false;
	}

	public void generateOTP() {
		password = "OTP" + (int) (Math.random() * 1000);
	}

	public void changeStatusTo(char status) {
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getDob() {
		return dob;
	}

	public char getGender() {
		return gender;
	}

	public char isMarried() {
		return isMarried;
	}

	public String getPassword() {
		return password;
	}

	public char getStatus() {
		return status;
	}

	public Contact getContact() {
		return contact;
	}

}
