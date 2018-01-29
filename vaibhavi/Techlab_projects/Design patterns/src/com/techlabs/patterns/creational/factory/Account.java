package com.techlabs.patterns.creational.factory;

public abstract class Account {
	
	int id;
	 String name;
	 double balance;
	AccountType type;
	
	
	public Account(int id,String name,double balance)
	{
		this.balance=balance;
		this.id=id;
		this.name=this.name;
	}
	
	public void deposit(double amount)
	{
		balance+=amount;
	}
	
	public abstract void widraw(double amount);

	public double getBalance() {
		return balance;
	}

}
