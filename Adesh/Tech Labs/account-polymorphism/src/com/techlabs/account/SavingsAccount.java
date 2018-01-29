package com.techlabs.account;

public class SavingsAccount extends Account {

	public SavingsAccount(int accNo, String name, double bal) {
		super(accNo, name, bal);
	}

	@Override
	public void withdraw(double amount) {
		if (bal - amount > 500) {
			bal = bal - amount;
		} else {
			System.out.println("Error");
		}
	}

}
