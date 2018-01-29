package com.techlab.account;

abstract public class Account {
	protected int accNo;
	protected String name;
	protected double balance;

	Account(int accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public void deposite(double amount) {
		this.balance = this.balance + amount;
	}

	public abstract double withdraw(double amount) throws InsufficientFundException;

	public int getAccNo() {
		return accNo;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
}
