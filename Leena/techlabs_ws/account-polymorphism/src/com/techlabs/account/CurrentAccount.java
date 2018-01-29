package com.techlabs.account;

public class CurrentAccount extends Account {
	
	@Override
	public void withdraw(double amount){
		balance=balance-amount;
		System.out.println(amount+" is withdrwal from ur Account");
	}
	
	public CurrentAccount(int id,String name,double balance){
		super(id,name,balance);
	}
}
