package com.techlabs.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Account {
	String name;
	double balance;
	List<IAccountListner> listOfListners;

	public Account(String name, double balance) {
		this.name = name;
		this.balance = balance;
		listOfListners=new ArrayList<IAccountListner>();
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(double amount) {
		balance -= amount;
		notifyAllListners();
	}

	public void deposit(double amount) {
		balance += amount;
		notifyAllListners();
	}

	void notifyAllListners(){
		for(IAccountListner listner:listOfListners)
			listner.updateBalance(this);
	}
	
	public void addAccountListner(IAccountListner listner) {
		listOfListners.add(listner);
	}

}
