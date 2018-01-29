package com.techlabs.patterns.behavioral.observer;

public class MobileScreen implements IAccountListner {

	@Override
	public void updateBalance(Account acc) {
		System.out.println("Updating on Mobile");
		System.out.println("Name:" + acc.getName() + " Balance:"
				+ acc.getBalance());
	}

}
