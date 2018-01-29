package com.practice.custom.exception;

public class InsufficientFundsException extends Exception{
	private double amount;
	public Account account;

	public InsufficientFundsException(Account account, double amount) {
		this.account=account;
		this.amount=amount;
	}

	@Override
	public String getMessage() {
		return "Error: Amount trying to withdraw by account holder "+account.getAccName()+" is = "+amount;
	}
	
	

}
