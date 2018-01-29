package com.techlabs.patterns.behavioral.proxy;

class Account {
	private int accNumber;
	private double balance;

	public Account(int accNumber,double balance){
		this.accNumber=accNumber;
		this.balance=balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount;
	}

}
