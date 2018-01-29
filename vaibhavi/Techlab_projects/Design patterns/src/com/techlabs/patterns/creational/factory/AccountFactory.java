package com.techlabs.patterns.creational.factory;

public class AccountFactory {
	
	static AccountFactory temp;
	
	private AccountFactory()
	{
		
	}
	
	public Account createAccount(AccountType type,int id,String name,int i)
	{
		Account account=null;
		if(type==AccountType.CA)
		{
			account=new CurrentAccount(id, name, i);
		}
		if(type==AccountType.SA)
		{
			account=new SavingAccount(id, name, i);
		}
		return account;
	}
	
	public static AccountFactory getInstance()
	{
		if(temp==null)
		{
			temp=new AccountFactory();
		}
		return temp;
	}

}
