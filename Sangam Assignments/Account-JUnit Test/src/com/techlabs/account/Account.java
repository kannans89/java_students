package com.techlabs.account;

import java.util.UUID;

public  class Account {
	private String name;
	private String accountNo;
	protected double balance;
	public Account(String name,double bal)
	{
		this.name=name;
		this.balance=bal;
		this.accountNo=UUID.randomUUID().toString();
	}
	
	public String getAccountNumber()
	{
		return accountNo;
	}
	public String getName()
	{
		return name;
	}
	public double getBalance()
	{
		return balance;
	}
	public void deposit(double bal)
	{
		if(bal>0)
			this.balance+=bal;
		else
			throw new InsuffiecientFundException(this);
	}	
	public  void withdraw(double amount)
	{
		if(balance-amount>1000)
			this.balance-=amount;
		else 
			throw new InsuffiecientFundException(this);
	}
}
