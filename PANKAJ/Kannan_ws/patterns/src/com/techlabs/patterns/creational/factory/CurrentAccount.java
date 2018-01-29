package com.techlabs.patterns.creational.factory;

public class CurrentAccount extends Account {

	public CurrentAccount(int id, String name, double balance) {
		super(id, name, balance);
		this.type = "CA";
	}

	@Override
	void withdraw(double amount) {
		balance -= amount;
	}

}
