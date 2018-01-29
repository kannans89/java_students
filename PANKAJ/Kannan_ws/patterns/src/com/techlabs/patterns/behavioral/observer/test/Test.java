package com.techlabs.patterns.behavioral.observer.test;

import com.techlabs.patterns.behavioral.observer.ATMScreen;
import com.techlabs.patterns.behavioral.observer.Account;
import com.techlabs.patterns.behavioral.observer.MobileScreen;

public class Test {

	public static void main(String[] args) {

		Account acc=new Account("Pankaj", 100000);
		
		acc.addAccountListner(new ATMScreen());
		acc.addAccountListner(new MobileScreen());
		
		acc.deposit(1500);
		acc.withdraw(300);
	}

}
