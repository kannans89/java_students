package com.techlabs.entity;

public class Vendor {
	private int id;
	private String name;
	private double balance;

	@Override
	public String toString() {
		return "Vendor [id=" + id + ", name=" + name + ", balance=" + balance
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
}
