package com.techlabs.account;

public class SavingAccount extends Account{

	public SavingAccount(int accno, String name, int balance) {
		super(accno, name, balance);
	}

	@Override
	public void withdraw(int amt) {
		if((balance-amt)>1000)
			balance = balance-amt;
	}

}
