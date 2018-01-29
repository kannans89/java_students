package com.techlabs.patterns.proxy;

import com.techlabs.patterns.creational.factory.AccountType;

public class Account {
	
	 String name;
	 double balance;
	
	
	public Account(int id,double balance)
	{
		this.balance=balance;
		this.name=this.name;
	}
	
	public void deposit(double amount)
	{
		balance+=amount;
	}
	
	public void widraw(double amount)
	{
		balance-=amount;
	}

	public double getBalance() {
		return balance;
	}

}
