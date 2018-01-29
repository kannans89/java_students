package com.techlabs.patterns.creational.factory;

public class AccountFactory {

	static AccountFactory temp;

	private AccountFactory() {
	}

	public static AccountFactory getInstance() {
		if (temp == null) {
			temp = new AccountFactory();
		}
		return temp;
	}

	public Account createAccount(int id,String name,double amount,AccType type){
		if(type==AccType.SA)
			return new SavingsAccount(id,name,amount);
		else 
			return new CurrentAccount(id,name,amount);
	}
}
