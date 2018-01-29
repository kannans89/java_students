package com.techlabs.account;

public class CurrentAccount extends Account {

	public CurrentAccount(int accno, String name, int balance) {
		super(accno, name, balance);
	}

	@Override
	public void withdraw(int amt) {
		balance = balance - amt;
	}

}
