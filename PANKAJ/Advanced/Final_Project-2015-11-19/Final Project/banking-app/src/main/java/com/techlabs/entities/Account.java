package com.techlabs.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int accno;
	private double balance;

	@ManyToOne
	private Customer customer;

	public Account() {
	}

	public Account(Customer customer) {
		this.customer = customer;
	}

	public Account(int accno, double balance) {
		this.accno = accno;
		this.balance = balance;
	}

	public int getAccno() {
		return accno;
	}

	public double getBalance() {
		return balance;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public boolean withdraw(double amount) {
		if (balance - amount >= 0) {
			balance -= amount;
			return true;
		}
		return false;

	}

}
