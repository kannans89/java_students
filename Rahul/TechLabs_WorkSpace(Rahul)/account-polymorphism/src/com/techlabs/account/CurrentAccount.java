package com.techlabs.account;

public class CurrentAccount extends Account {
	// constructor
	public CurrentAccount(int accNo, String name, double balance) {
		super(accNo, name, balance);
	}

	@Override
	public void withdrawAmount(double amountToWithdraw) {

		accountBalance = accountBalance - amountToWithdraw;

	}
}
