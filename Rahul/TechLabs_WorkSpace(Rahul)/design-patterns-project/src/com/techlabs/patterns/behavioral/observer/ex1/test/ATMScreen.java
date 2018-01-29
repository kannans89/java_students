package com.techlabs.patterns.behavioral.observer.ex1.test;

import com.techlabs.patterns.behavioral.observer.ex1.Account;
import com.techlabs.patterns.behavioral.observer.ex1.IAccountObserver;

public class ATMScreen implements IAccountObserver {

	@Override
	public void balanceChanged(Account acc) {
		System.out.println("---------------- ATM SCREEN ----------------");
		System.out
				.println("Please wait while we are updating the status of ue Account");
		System.out.println("Updating Status...........");
		System.out.println();
		System.out.println("Account Number : " + acc.getAccountNumber());
		System.out.println("Account Holder Name : "
				+ acc.getAccountHolderName());
		System.out.println("Account Type : " + acc.getAccountType());
		System.out.println("Current Balance :- Rs." + acc.getAccountBalance());
		System.out
				.println("====================================================");
		System.out.println();

	}

}
