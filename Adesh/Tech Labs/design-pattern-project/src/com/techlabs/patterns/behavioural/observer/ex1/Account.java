package com.techlabs.patterns.behavioural.observer.ex1;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int accNo;
	private String name;
	private double balance;
	private List<IAccountObserver> listObserver;
	
	public Account(int accNo, double balance, String name){
		this.accNo = accNo;
		this.balance = balance;
		this.name = name;
		listObserver = new ArrayList<IAccountObserver>();
	}
	
	public int getAccNo() {
		return accNo;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount){
       this.balance = (this.balance + amount);
       notifyObserver();
	}
	
	public void withDraw(double amount){
		this.balance = (this.balance - amount);
		notifyObserver();
	}

	private void notifyObserver() {
		for(IAccountObserver x:listObserver){
               x.balanceChanged(this);
		}
	}
	
	public void addAccountObserver(IAccountObserver observer){
		listObserver.add(observer);
	}

}
