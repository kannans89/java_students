package com.techlabs.patterns.creational.factory;

public abstract class Account {
	int id;
	String name;
	double balance;
	String type;

	public Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	abstract void withdraw(double amount);

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance
				+ ", type=" + type + "]";
	}
	
	
}
