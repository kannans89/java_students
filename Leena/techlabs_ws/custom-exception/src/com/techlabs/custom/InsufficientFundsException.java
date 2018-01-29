package com.techlabs.custom;

public class InsufficientFundsException extends RuntimeException {
	
	private Account account;
	private double withdrawMoney;
	public InsufficientFundsException(Account acc) {
		this.account=acc;
	}
	
	 public InsufficientFundsException(Account acc,double amount) {
		 this(acc);
		 this.withdrawMoney=amount;
	}
	
	@Override
	public String getMessage(){
		String details="Sorry ,"+account.getCustomerName()+" your current balance is : "+account.getBalance()+"$"+" You can not withdraw "+this.withdrawMoney+"$";
		return details;
	}

}
