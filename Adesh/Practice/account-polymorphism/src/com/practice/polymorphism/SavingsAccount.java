package com.practice.polymorphism;

public class SavingsAccount extends Account{
	
	public SavingsAccount(int accNo, String name, double bal){
		super(accNo,name,bal);
	}
	
	@Override
	public void withdraw(double amount){
		if((bal-amount)>500){
			bal=bal-amount;
		}else
		{
			System.out.println("Error: minimum balance should b more than Rs. 500");
		}
	}

}
