package com.techlab.account;

public class SavingAccount extends Account {
	public SavingAccount(int accNo, String name, double balance) {
		super(accNo, name, balance);
	}

	@Override
	public double withdraw(double amount) throws InsufficientFundException {
		if ((balance - amount) >=500) {
			return balance - amount;
		}
			else 
				throw new InsufficientFundException("InsufficientFundException occured");
		
	}
}
