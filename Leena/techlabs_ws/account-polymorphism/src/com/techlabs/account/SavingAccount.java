package com.techlabs.account;

public class SavingAccount extends Account {

	@Override
	public void withdraw(double amount){
		
		if((balance-amount)>500){
			balance=balance-amount;
			System.out.println(amount+" is deducted from your Account");
		}
		else{
			System.out.println("oops..ur balance is low");
		}
			}
	
	public SavingAccount(int id, String name, double balance){
		super(id,name,balance);
	}
}
