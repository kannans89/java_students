package com.practice.patterns.behavioural.observer.ex1.test;

import com.practice.patterns.behavioural.observer.ex1.Account;
import com.practice.patterns.behavioural.observer.ex1.IAccountObserver;

public class AccountTest {

	public static void main(String[] args) {
		Account acc1 = new Account(101, "Adesh", 50000);
		AtmScreen atm = new AtmScreen();
		MobileScreen mobile = new MobileScreen();
		
		acc1.addAccontObserver(atm);
		acc1.addAccontObserver(mobile);
		acc1.addAccontObserver(new IAccountObserver() {
			
			public void balanceChanged(Account acc) {
				System.out.println("\n********************\nBROWSER SCREEN : WELCOME\n********************\n");
				System.out.println("Account Details is refreshing...\n   please wait..");
				System.out.println("Account no = "+acc.getAccNo());
				System.out.println("Account name = "+acc.getName());
				System.out.println("Account Balance = "+acc.getBalance());
			}
		});
		
		acc1.deposit(10000);
		acc1.withdraw(5000);
	}

}
