package com.techlabs.account.test;

import com.techlabs.account.Account;
import com.techlabs.account.CurrentAccount;
import com.techlabs.account.SavingAccount;

public class AccountTest {

	public static void main(String[] args) {
		currentAccount();
		savingAccount();

	}

	private static void printSlip(Account x) {
		System.out.println("Account No:" + x.getAccno() + " Name:"
				+ x.getName() + " Balance:" + x.getBalance());
	}

	private static void savingAccount() {
		SavingAccount savingAccount = new SavingAccount(11, "Mayur", 1000);
		savingAccount.deposit(1000);
		printSlip(savingAccount);
		savingAccount.withdraw(500);
		printSlip(savingAccount);
	}

	private static void currentAccount() {
		CurrentAccount currentAccount = new CurrentAccount(10, "Vikram", 2000);
		currentAccount.deposit(1000);
		printSlip(currentAccount);
		currentAccount.withdraw(4000);
		printSlip(currentAccount);

	}

}
