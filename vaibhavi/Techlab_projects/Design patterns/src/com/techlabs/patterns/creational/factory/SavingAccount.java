package com.techlabs.patterns.creational.factory;

public class SavingAccount extends Account{
	
	
	public SavingAccount(int id,String name,double balance)
	{
		super(id,name,balance);
		this.type=AccountType.SA;
	}

	@Override
	public void widraw(double amount) {
		
		if(balance>500)
		{
			balance-=amount;
		}
		else
		{
			System.out.println("Can not widraw!");
		}
		
	}
	

}
