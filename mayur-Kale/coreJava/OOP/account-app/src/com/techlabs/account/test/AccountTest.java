package com.techlabs.account.test;

import com.techlabs.account.Account;

public class AccountTest {

	public static void main(String[] args) {

		// shouldCreateAccountUsingThreeParameters();
		// shouldCreateAccountUsingTwoParameters();
		// shouldDepositDetails();
		// shouldDepositDetails();
		// shouldWithDrawDetails();
		// shouldWithDrawDetails();
		// testNoOfAccounts();
		// calculateHeadAccounts();
		// calculateTotalDepositHappened();
		// calculateTotalWithdrawHappened();
		  fromatingAccount();	
		 
	}

	private static void fromatingAccount() {
		Account acc = new Account(10, "Mayur", 1000);
		System.out.println(acc);
//		System.out.println(acc.toString());
//		System.out.println(acc.getClass());
//		System.out.println(acc.getClass().getSimpleName());
		
	}

	private static void calculateTotalWithdrawHappened() {

		System.out.println("Total Money Withdrawn across all account: "
				+ Account.totalWithdrawHappened());

	}

	private static void calculateTotalDepositHappened() {

		System.out.println("Total Money Deposited across all account: "
				+ Account.totalDepositHappened());

	}

	private static void calculateHeadAccounts() {

		System.out.println("Total Head Accounts :" + Account.totalHeadCount());
	}

	private static void testNoOfAccounts() {

		Account userOne = new Account(1, "Mayur", 1000);
		Account userTwo = new Account(2, "Vikram");
		Account userThree = new Account(3, "Abc", 300);

		System.out.println(userOne.getAccountHolder());

		System.out.println(userTwo.getAccountHolder());

		System.out.println(userThree.getAccountHolder());

	}

	private static void shouldWithDrawDetails() {

		Account account = new Account(10, "Mayur", 1000);

		System.out.println("Account Details Before Withdraw");
		printAccountDetails(account);

		account.withdraw(500);

		System.out.println("Account Details after Withdraw");
		printAccountDetails(account);

	}

	private static void shouldDepositDetails() {

		Account account = new Account(10, "Mayur", 1000);

		System.out.println("Account Details Before Deposit");
		printAccountDetails(account);

		account.deposit(1000);

		System.out.println("Account Details after Desposit");
		printAccountDetails(account);

	}

	private static void shouldCreateAccountUsingTwoParameters() {

		Account account = new Account(11, "Vikram");
		printAccountDetails(account);

	}

	private static void shouldCreateAccountUsingThreeParameters() {

		Account account = new Account(12, "Mayur", 1000);
		printAccountDetails(account);

	}

	private static void printAccountDetails(Account account) {

		System.out.println("Name:" + account.getName() + " Account No:"
				+ account.getAccno() + " Balance:" + account.getBalance());
	}

}
