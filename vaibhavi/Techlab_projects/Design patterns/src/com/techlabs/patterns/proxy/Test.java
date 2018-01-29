package com.techlabs.patterns.proxy;

public class Test {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account=new AccountProxy(1, 5000);
		account.deposit(1000);
		System.out.println("balance is:" +account.getBalance());
		account.widraw(1000);
		System.out.println("balance is:" +account.getBalance());

	}

}
