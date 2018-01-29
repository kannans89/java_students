package com.practice.patterns.behavioural.observer.ex1.test;

import com.practice.patterns.behavioural.observer.ex1.Account;
import com.practice.patterns.behavioural.observer.ex1.IAccountObserver;

public class MobileScreen implements IAccountObserver{

	public void balanceChanged(Account acc) {
		System.out.println("\n********************\nMOBILE SCREEN : WELCOME\n********************\n");
		System.out.println("Account Details is refreshing...\n   please wait..");
		System.out.println("Account no = "+acc.getAccNo());
		System.out.println("Account name = "+acc.getName());
		System.out.println("Account Balance = "+acc.getBalance());
	}

}
