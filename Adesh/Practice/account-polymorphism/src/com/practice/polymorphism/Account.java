package com.practice.polymorphism;

public abstract class Account {
	private int accNo;
	private String name;
	protected double bal;
	
	public Account(int accNo, String name, double bal){
		this.accNo=accNo;
		this.name=name;
		this.bal=bal;
	}
	
	public int getAccountNo(){
		return accNo;
	}
	
	public String getName(){
		return name;
	}
	
	public double getBalance(){
		return bal;
	}
	
	public void deposit(double amount){
		bal=bal+amount;
	}
	
	public void withdraw(double amount){
		
	}

}
