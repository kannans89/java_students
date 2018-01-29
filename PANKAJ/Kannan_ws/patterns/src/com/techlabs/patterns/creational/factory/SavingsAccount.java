package com.techlabs.patterns.creational.factory;

public class SavingsAccount extends Account {

	SavingsAccount(int id, String name, double balance) {
		super(id, name, balance);
		this.type = "SA";
	}

	@Override
	public void withdraw(double amount) {
		if (balance - amount >= 5000)
			balance -= amount;
	}
}
