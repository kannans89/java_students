package com.practice.polymorphism;

public class CurrentAccount extends Account{
	
	public CurrentAccount(int accNo, String text, double bal){
		super(accNo,text,bal);
	}
	
	@Override
	public void withdraw(double amount){
		bal=bal-amount;
	}

}
