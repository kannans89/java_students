package com.techlabs.patterns.behavioral.obserever.ex1.test;
import com.techlabs.patterns.behavioral.obserever.ex1.Account;
import com.techlabs.patterns.behavioral.obserever.ex1.IAccountObserver;

public class MobileService implements IAccountObserver{
	
	@Override
	public void balanceChanged(Account acc){
		System.out.println(" Welcome to Mobile Service");
		System.out.println(" Your Account stutus is updating...");
		System.out.println(acc.getName()+" your current balance is :"+acc.getbalance());
	}

}
