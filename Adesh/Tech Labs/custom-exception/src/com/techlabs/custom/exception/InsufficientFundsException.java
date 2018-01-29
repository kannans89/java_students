package com.techlabs.custom.exception;

public class InsufficientFundsException extends Exception {
	private Account account;
	private double amount;

	public InsufficientFundsException(Account account, double amount) {
		this.setAccount(account);
		this.amount = amount;
	}

	public InsufficientFundsException(double amount2) {
		amount = amount2;
	}

	public String getMessage() {
		// return
		// "no funds transfer for this account holder "+account.getName()+"\n balance is "+account.getBalance()+"\namount trying to withdraw is = "+amount;
		return "Transaction Failed:\nAmount trying to withdraw which is more than balance = " + amount;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

}
