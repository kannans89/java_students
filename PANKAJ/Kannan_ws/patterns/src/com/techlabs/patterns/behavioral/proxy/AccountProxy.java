package com.techlabs.patterns.behavioral.proxy;

public class AccountProxy extends Account {

	public AccountProxy(int AccNumber, double balance) {
		super(AccNumber, balance);
	}

	@Override
	public void deposit(double amount) {
		Logger.log("Before depositing " + amount);
		super.deposit(amount);
		Logger.log("After depositing " + amount);
	}

	@Override
	public void withdraw(double amount) {
		Logger.log("Before withdrawing " + amount);
		super.deposit(amount);
		Logger.log("After withdrawing " + amount);
	}

}
