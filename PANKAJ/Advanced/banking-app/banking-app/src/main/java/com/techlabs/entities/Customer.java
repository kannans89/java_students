package com.techlabs.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Customer extends User {
	private String occupation;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private Set<Account> accounts;

	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private Set<Payee> payees;

	public Customer() {
		super();
	}

	public Customer(String name, Date dob, char gender, char isMarried, String occupation, String email, String mobile,
			String city, int pin, String address) {
		super(name, dob, gender, isMarried, email, mobile, city, pin, address);
		this.occupation = occupation;
		payees = new HashSet<Payee>();
		accounts = new HashSet<Account>();
		accounts.add(new Account(this));
	}

	public Customer(int id, String name, Date dob, char gender, char isMarried, String password, char status,
			String occupation, Contact contact) {
		super(id, name, dob, gender, isMarried, password, status, contact);
		this.occupation = occupation;
		accounts = new HashSet<Account>();
		payees = new HashSet<Payee>();
	}

	public void update(String mobile, String email, String occupation) {
		super.update(mobile, email);
		this.occupation = occupation;
	}

	public void addPayee(Payee payee) {
		this.payees.add(payee);
	}

	public Set<Account> getAccounts() {
		return accounts;
	}

	public Set<Payee> getPayees() {
		return payees;
	}

	public String getOccupation() {
		return occupation;
	}

}
