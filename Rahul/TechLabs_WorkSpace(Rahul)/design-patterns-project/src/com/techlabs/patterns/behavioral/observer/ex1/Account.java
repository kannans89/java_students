package com.techlabs.patterns.behavioral.observer.ex1;

import java.util.ArrayList;
import java.util.List;

public class Account {
	// Ivars
	private int accountNumber;
	private AccountType accountType;
	private String accountHolderName;
	private double accountBalance;

	private List<IAccountObserver> observerList;

	// Constructor
	public Account(int accNumber, AccountType accType, String accHolderName,
			double accBalance) {
		accountNumber = accNumber;
		accountType = accType;
		accountHolderName = accHolderName;
		accountBalance = accBalance;
		observerList = new ArrayList<IAccountObserver>();
	}

	// Methods

	public int getAccountNumber() {
		return accountNumber;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void removeAccountObserver(IAccountObserver observer) {
		if (!observerList.isEmpty()) {
			if (observerList.contains(observer)) {
				observerList.remove(observer);
			}
		}

	}

	public void addAccountObserver(IAccountObserver observer) {
		observerList.add(observer);
	}

	public void depositAmount(double amountToDeposit) {
		if (amountToDeposit > 0.00) {
			accountBalance = accountBalance + amountToDeposit;
			notifyObservers();
		} else {
			System.out.println("Enter Correct amount to be Deposited");
		}
	}

	public void withdrawAmount(double amountToWithDraw) {
		if ((accountBalance - amountToWithDraw) > 1000) {
			accountBalance = accountBalance - amountToWithDraw;
			notifyObservers();
		} else {
			System.out.println("Cannot Withdraw amount!!!");
		}
	}

	private void notifyObservers() {
		if (!observerList.isEmpty()) {
			for (IAccountObserver currentObserver : observerList) {
				currentObserver.balanceChanged(this);
			}
		} else {
			System.out.println("No Observers to notify");
		}
	}

}
