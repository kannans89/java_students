package com.techlabs.patterns.behavioral.observer;

public class ATMScreen implements IAccountListner {

	@Override
	public void updateBalance(Account acc) {
		System.out.println("Updating on ATM");
		System.out.println("Name:"+acc.getName()+" Balance:"+acc.getBalance());
	}

}
