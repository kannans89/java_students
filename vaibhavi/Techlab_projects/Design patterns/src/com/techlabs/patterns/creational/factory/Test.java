package com.techlabs.patterns.creational.factory;

public class Test {

	public static void main(String[] args) {

		
		Account account= AccountFactory.getInstance().createAccount(AccountType.CA, 1, "vaibhavi", 5000);
		account.deposit(500);
		account.widraw(300);
		System.out.println(account);
		System.out.println(account.getBalance());
	
		
	}

}
