package com.techlab.accountpolymorphism;

public  abstract class Account {

	protected String name;
	protected double balance;
	
	public  Account(String name,double balance)
	{
		this.name=name;
		this.balance=balance;
	}
	public String getName()
	{
		return name;
	}
	public double getBalance()
	{
		return balance;
	}
	public void deposit(double amount)
	{
		balance+=amount;
	}
	public  abstract void widraw(double amount);
}
