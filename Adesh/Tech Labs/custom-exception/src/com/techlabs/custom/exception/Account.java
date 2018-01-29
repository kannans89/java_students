package com.techlabs.custom.exception;

public class Account {
	private int accNo;
	private String name;
	protected double bal;

	public Account(int accNo, String name, double bal) {
		this.accNo = accNo;
		this.name = name;
		this.bal = bal;
	}

	public int getAccountNo() {
		return accNo;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return bal;
	}

	public void deposit(double amount) {
		this.bal = amount + this.bal;
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		if (bal - amount > 500) {
			bal = bal - amount;
		} else {
			/* throw new Exception("No funds transfer for this holder"); */
			/* throw new RuntimeException("No funds transfer for this holder"); */
			// throw new InsufficientFundsException(this,amount);
			throw new InsufficientFundsException(amount);
		}
	}
}
