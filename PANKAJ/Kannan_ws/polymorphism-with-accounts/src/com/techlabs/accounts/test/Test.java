package com.techlabs.accounts.test;

import com.techlabs.accounts.Account;
import com.techlabs.accounts.CurrentAccount;
import com.techlabs.accounts.SavingsAccount;

public class Test {

	public static void main(String[] args) {

		try {
			testSavingsAcc();
			testCurrentAcc();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	static void testSavingsAcc() {
		SavingsAccount sa = new SavingsAccount("Pankaj", 5000);
		printStatement(sa);
		sa.withdraw(1000);
		printStatement(sa);
	}

	static void testCurrentAcc() {
		CurrentAccount ca = new CurrentAccount("Kannan", 10000);
		printStatement(ca);
		ca.withdraw(1000);
		printStatement(ca);
	}

	static void printStatement(Account ac) {
		System.out.println("Name is: " + ac.getName());
		System.out.println("Balance is: " + ac.getBalance());
		System.out.println("Thanks");
	}

}
