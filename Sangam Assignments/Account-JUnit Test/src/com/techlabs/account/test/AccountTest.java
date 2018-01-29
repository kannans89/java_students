package com.techlabs.account.test;

import com.techlabs.account.Account;

public class AccountTest {

	public static void main(String[] args) {
		/*Account account = new Account("Sangam", 100000);
		account.deposit(50000);
		account.withdraw(25000);
		printDetails(account);
*/
	}

	public static void printDetails(Account account) {
		System.out.println("Name = " + account.getName() + "\nAccountNumber = "
				+ account.getAccountNumber() + "\nUpdated Balance = "
				+ account.getBalance()+"\n");
	}
}
