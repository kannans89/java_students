package com.techlabs.accounts;

public class CurrentAccount extends Account {

	public CurrentAccount(String name, double amount) {
		super(name, amount);
	}

	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}

}
