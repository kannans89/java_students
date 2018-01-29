package com.techlabs.accounts;

public class SavingsAccount extends Account {

	public SavingsAccount(String name, double balance) {
		super(name, balance);
	}

	@Override
	public void withdraw(double amount) {
		if (balance - amount > 500)
			balance -= amount;
		else
			throw new RuntimeException("Insufficient funds");
	}

}
