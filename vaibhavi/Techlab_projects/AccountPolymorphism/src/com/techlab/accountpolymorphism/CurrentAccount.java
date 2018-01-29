package com.techlab.accountpolymorphism;

public class CurrentAccount extends Account{

	public  CurrentAccount(String name,double balance)
	{
		 super(name, balance);
		
	}
	@Override
	 public void widraw(double amount)
	 {
		 balance-=amount;
	 }
	

	
}
