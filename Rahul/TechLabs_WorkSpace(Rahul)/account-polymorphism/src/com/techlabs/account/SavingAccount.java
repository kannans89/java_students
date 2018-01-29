package com.techlabs.account;

public class SavingAccount extends Account{
	//constructor
	public SavingAccount(int accNo, String name, double balance){
		super(accNo,name,balance);
	}
	//method
	@Override
	public  void withdrawAmount(double amountToWithdraw){
		if ((accountBalance - amountToWithdraw) > 500){
			accountBalance = accountBalance - amountToWithdraw;
		}
		else
		{
		System.out.println("Not Sufficient Balance");	
		}
		
	}
	
}
