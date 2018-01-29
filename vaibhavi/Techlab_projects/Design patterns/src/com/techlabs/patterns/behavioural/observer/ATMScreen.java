package com.techlabs.patterns.behavioural.observer;

public class ATMScreen implements IAccountListener {

	@Override
	public void updateBalance(Account account) {

		System.out.println("ATM is Updating balance...");
		System.out.println("Please wait..."+ account.getName());
		System.out.println("BAlance is..."+account.getBalance());
	}

}
