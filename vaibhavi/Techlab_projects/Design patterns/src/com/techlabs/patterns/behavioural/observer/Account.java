package com.techlabs.patterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Account {
	
	private String name;
	private double balance;
	List<IAccountListener> listners=new ArrayList<IAccountListener>();
	
	public Account(String name,double balance)
	{
		this.balance=balance;
		this.name=name;
	}
	
	public void addAccountListener(IAccountListener listener)
	{
		listners.add(listener);
	}
	
	public void deposit(double amount)
	{
		balance+=amount;
		notifyAllUsers();
	}
	
	public void widraw(double amount)
	{
		balance-=amount;
		notifyAllUsers();
	}
	
	private void notifyAllUsers()
	{
		for(IAccountListener listener:listners)
		{
			listener.updateBalance(this);
		}
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

}
