package com.techlabs.account;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private final int accNumber;
	private final String name;

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public String getName() {
		return name;
	}

	private float balance;
	private List<IBalanceListener> list;

	public Account(int accNumber, String name, float balance) {
		this.accNumber = accNumber;
		this.name = name;
		this.balance = balance;
		list = new ArrayList<IBalanceListener>();
	}

	public void deposit(float amt) {
		this.balance = this.balance + amt;
		this.notifySubcriber();
	}

	public void withdraw(float amt) {
		this.balance = this.balance - amt;
		this.notifySubcriber();
	}

	public void addListener(IBalanceListener listener) {
		list.add(listener);
	}

	public void removeListener(IBalanceListener listener) {
		list.remove(listener);
	}

	private void notifySubcriber() {
		for (IBalanceListener iBalanceListener : list) {
			iBalanceListener.onBalanceChanged(this);
		}
	}
}
