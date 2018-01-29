package com.techlabs.account;

public abstract class Account {

	private int accNo;
	private String name;
	protected double balance;

	public Account(int accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accNo;
	}

	public String getCustomerName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposite(double amount){
		
		this.balance+=amount;
		System.out.println(amount+ " is added successfully to ur account");
	}
	
	public abstract void withdraw(double amount);
}
