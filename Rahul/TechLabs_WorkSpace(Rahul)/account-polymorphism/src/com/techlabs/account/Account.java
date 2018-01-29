package com.techlabs.account;

public abstract class Account {
	// Constructor
	public Account(int accNo, String name, double balance) {
		accountNumber = accNo;
		accountHolderName = name;
		accountBalance = balance;
	}

	// methods
	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}
	
	public void depositAmount(double amountToDeposite){
		accountBalance = accountBalance + amountToDeposite;
		
	}
	public abstract void withdrawAmount(double amountToWithdraw);
		
	

	// Instance Variables
	private int accountNumber;
	private String accountHolderName;
	protected double accountBalance;

}
