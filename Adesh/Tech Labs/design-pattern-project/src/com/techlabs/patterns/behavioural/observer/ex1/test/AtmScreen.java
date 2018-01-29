package com.techlabs.patterns.behavioural.observer.ex1.test;

import com.techlabs.patterns.behavioural.observer.ex1.Account;
import com.techlabs.patterns.behavioural.observer.ex1.IAccountObserver;

public class AtmScreen implements IAccountObserver{

	public void balanceChanged(Account obj) {
		System.out.println("\nATM SCREEN\n");
		System.out.println("welcome..! In the ATM screen...");
		System.out.println("Wait...!\nAccount is refreshing...");
		System.out.println("Account no = "+obj.getAccNo());
		System.out.println("Account Name = "+obj.getName());
		System.out.println("Account balance = "+obj.getBalance());
	}
}
