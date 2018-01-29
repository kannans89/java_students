package com.techlabs.account;

public abstract class Account {
	private final int accno;
	private final String name;
	protected int balance;

	public int getAccno() {
		return accno;
	}

	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}

	public Account(int accno, String name, int balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public void deposit(int amt) {
		balance = balance + amt;
	}

	abstract public void withdraw(int amt);
}
