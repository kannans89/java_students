package com.techlabs.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Payee {
	@Id
	private int accno;

	@ManyToOne
	//@JoinColumn(name = "id")
	private Customer customer;

	public Payee() {

	}

	public Payee(int accno, Customer customer) {
		this.accno = accno;
		this.customer = customer;
	}

	public Customer getCustomer() {
		return customer;
	}

	public int getAccno() {
		return accno;
	}

}
