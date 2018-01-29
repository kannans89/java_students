package com.techlabs.patterns.behavioural.observer;

public class Test {

	public static void main(String[] args) {

		Account account=new Account("Vaibhavi",5000);
		account.addAccountListener(new ATMScreen());
		account.addAccountListener(new MobileScreen());
		account.deposit(1000);
		account.widraw(500);
	}

}
