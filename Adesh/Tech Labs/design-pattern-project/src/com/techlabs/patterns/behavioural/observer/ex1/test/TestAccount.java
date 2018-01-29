package com.techlabs.patterns.behavioural.observer.ex1.test;

import com.techlabs.patterns.behavioural.observer.ex1.Account;
import com.techlabs.patterns.behavioural.observer.ex1.IAccountObserver;

public class TestAccount {

	public static void main(String[] args) {

		Account acc1 = new Account(102, 5000, "Savings");

		AtmScreen atm = new AtmScreen();
		MobileScreen mobile = new MobileScreen();

		acc1.addAccountObserver(atm);
		acc1.addAccountObserver(mobile);
		acc1.addAccountObserver(new IAccountObserver() {

			public void balanceChanged(Account acc) {
				System.out.println("\nBROWSER SCREEN\n");
				System.out.println("Welcome in the Browser Screen");
				System.out.println("Account no = " + acc.getAccNo());
				System.out.println("Account name = " + acc.getName());
				System.out.println("Account balance = " + acc.getBalance());
			}
		});

		acc1.deposit(1000);
		acc1.withDraw(2000);

	}

}
