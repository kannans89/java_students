package com.techlabs.account.test;

import com.techlabs.account.Account;
import com.techlabs.account.CurrentAccount;
import com.techlabs.account.SavingsAccount;

public class Test {

	public static void main(String[] args) {
		SavingsAccount acc1 = new SavingsAccount(101, "Adesh", 2000);
		CurrentAccount acc2 = new CurrentAccount(201, "Kannan", 3000);

		printAccountDetails(acc1);
		printAccountDetails(acc2);

		acc1.deposit(200);
		acc2.deposit(500);

		acc1.withdraw(2001);
		acc2.withdraw(5001);

		printAccountDetails(acc1);
		printAccountDetails(acc2);

	}

	private static void printAccountDetails(Account account) {
		System.out.println("Account no = " + account.getAccountNo());
		System.out.println("Account name = " + account.getName());
		System.out.println("Total Account balance = " + account.getBalance());
	}

}
