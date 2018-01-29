package com.techlab.account;

public class CurrentAccount extends Account{
	public CurrentAccount(int accNo,String name,double balance){
		super(accNo,name,balance);
	}
	
	@Override
	public double withdraw(double amount) throws InsufficientFundException{
		if((balance-amount)>-2000){
			return balance-amount;
			}
		else 
			throw new InsufficientFundException("Exception ccured");
		
		}

}
