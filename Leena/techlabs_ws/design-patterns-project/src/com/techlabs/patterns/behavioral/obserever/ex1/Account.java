package com.techlabs.patterns.behavioral.obserever.ex1;
import java.util.ArrayList;
import java.util.List;


public class Account {
	
	private int accNo;
	private String name;
	private double balance;
	private List<IAccountObserver> listObservers;
	
	public Account(int accNo,String name,double balance){
		this.accNo=accNo;
		this.name=name;
		this.balance=balance;
		this.listObservers=new ArrayList<IAccountObserver>();
	}
	
	public int getAccNo(){
		return accNo;
	}
	
	public String getName(){
		return name;
	}
	
	public double getbalance(){
		return balance;
	}
	
	public void deposite(double amount){
		this.balance+=amount;
		notifyObservers();
	}
	
	public void withdraw(double amount){
		if((balance-amount)>500){
			 balance-=amount;
			 notifyObservers();
		}
		else{
			System.out.println("Sorry your balance is low");
			notifyObservers();
		}
		
	}
	
	private void notifyObservers(){
		if(!listObservers.isEmpty()){
		for(IAccountObserver observer:listObservers){
			observer.balanceChanged(this);
			System.out.println("------------------");
		}
		}else{
			System.out.println("Observer List is empty");
		}
		
	
	}
	
	public void addAccountObserver(IAccountObserver observer){
		listObservers.add(observer);
	}

}
