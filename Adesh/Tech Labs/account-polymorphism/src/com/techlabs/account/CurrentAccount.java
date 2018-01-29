package com.techlabs.account;

public class CurrentAccount extends Account{
	
	public CurrentAccount(int accNo, String name, double bal) {
		super(accNo, name, bal);
	}

	@Override
	public void withdraw(double amount){
		bal=bal-amount;
	}

}
