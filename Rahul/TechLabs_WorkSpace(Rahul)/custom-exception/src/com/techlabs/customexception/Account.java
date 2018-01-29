package com.techlabs.customexception;

public class Account {
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

	public void depositAmount(double amountToDeposite) {
		accountBalance = accountBalance + amountToDeposite;

	}

	public void withdrawAmount(double amountToWithdraw)throws InsufficientFundsException{
		if(accountBalance - amountToWithdraw >500){
			accountBalance = accountBalance - amountToWithdraw;
		}
		else
		{
			throw new InsufficientFundsException(this, amountToWithdraw);
		}
	}

	// Instance Variables
	private int accountNumber;
	private String accountHolderName;
	protected double accountBalance;

}
