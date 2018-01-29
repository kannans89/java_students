package com.techlabs.patterns.behavioural.observer.ex1.test;

import com.techlabs.patterns.behavioural.observer.ex1.Account;
import com.techlabs.patterns.behavioural.observer.ex1.IAccountObserver;

public class MobileScreen implements IAccountObserver{

	public void balanceChanged(Account obj) {
		System.out.println("\nMOBILE SCREEN\n");
		System.out.println("Welcome...! In the Mobile App now.");
		System.out.println("Wait...!\nAccount is refreshing...");
		System.out.println("Account no = "+obj.getAccNo());
		System.out.println("Account Name = "+obj.getName());
		System.out.println("Account balance = "+obj.getBalance());
	}
}
