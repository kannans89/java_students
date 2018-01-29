package com.techlabs.patterns.behavioral.obserever.ex1.test;

import com.techlabs.patterns.behavioral.obserever.ex1.Account;
import com.techlabs.patterns.behavioral.obserever.ex1.IAccountObserver;

public class Test {

	public static void main(String[] args) {
		
		//ATMService atm1=new ATMService();
		//MobileService mobile1=new MobileService();
		Account acc1=new Account(101, "Leena", 2000);
		//acc1.addAccountObserver(atm1);
		//acc1.addAccountObserver(mobile1);
		
		acc1.addAccountObserver(new IAccountObserver() {
			//creating an anonimous class or implementing inline function ....
			@Override
			public void balanceChanged(Account acc) {
				System.out.println("This is a PC Screen");
				System.out.println(acc.getName()+ " your Account is updating.."+" your balance is : "+acc.getbalance());
			}
		});
		
		acc1.deposite(200);
		acc1.withdraw(500);
		
		
		
	}

}
