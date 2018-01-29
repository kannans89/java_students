package com.practice.patterns.behavioural.observer.ex1;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int accNo;
	private String name;
	private double balance;
	private List<IAccountObserver> listObserver;
	
	public Account(int accNo, String name, double balance){
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		listObserver = new ArrayList<IAccountObserver>();
	}

	public int getAccNo() {
		return this.accNo;
	}

	public String getName() {
		return this.name;
	}

	public double getBalance() {
		return this.balance;
	}

	public void deposit(double amount){
		this.balance = (this.balance + amount);
		notifyObserver();
	}
	
	public void withdraw(double amount){
		this.balance = (this.balance - amount);
		notifyObserver();
	}

	private void notifyObserver() {
		for(IAccountObserver x:listObserver){
			x.balanceChanged(this);
		}
	}
	
	public void addAccontObserver(IAccountObserver observer){
		listObserver.add(observer);
	}
}
