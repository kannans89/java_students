package com.techlabs.patterns.proxy;

public class AccountProxy extends Account{

	public AccountProxy(int id, double balance) {
		super(id, balance);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void deposit(double amount)
	{
		Logger logger=new Logger();
		logger.Log("Before deposite:");
		super.deposit(amount);
		logger.Log("After deposite:");
	}
	@Override
	public void widraw(double amount)
	{
		Logger logger=new Logger();
		logger.Log("Before widraw:");
		super.widraw(amount);
		logger.Log("After widraw:");
	}
	
	

}
