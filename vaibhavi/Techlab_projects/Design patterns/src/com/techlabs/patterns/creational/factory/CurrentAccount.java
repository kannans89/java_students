package com.techlabs.patterns.creational.factory;

public class CurrentAccount extends Account{

	public CurrentAccount(int id, String name, double balance) {
		super(id, name, balance);
		type=AccountType.CA;
	}

	@Override
	public void widraw(double amount) {
		balance-=amount;
		
	}

}
