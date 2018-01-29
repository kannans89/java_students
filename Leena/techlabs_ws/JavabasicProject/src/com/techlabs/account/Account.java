package com.techlabs.account;

public class Account {
	
	private int id;
	private String name;
	private double balance;
	
	public Account(int id,String name,double balance){
	//for passing the values for instance variables we use "this" keyword	
		this.id=id;
		this.name=name;
		this.balance=balance;
		
		//System.out.println("Inside Constructor");
	}
	
	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double balance){
		
		this.balance=balance;
	}
}

