package com.techlab.accountpolymorphism;

public class SavingsAccount extends Account{

	public  SavingsAccount(String name,double balance)
	{
		 super(name, balance);
		
	}
	
	@Override
	 public void widraw(double amount)
	 {
		 if(balance-amount>500)
		  {balance-=amount;
		  
		  }
		 else throw new RuntimeException("Balance inSufficient");
		 
		 
	 }
}
