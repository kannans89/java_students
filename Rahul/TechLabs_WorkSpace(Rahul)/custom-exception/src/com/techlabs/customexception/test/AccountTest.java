package com.techlabs.customexception.test;

import com.techlabs.customexception.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account account1 = new Account(1002, "Rahul", 5000);
		account1.depositAmount(1000);
		try {
			account1.withdrawAmount(4000);
		} catch (Exception ex) {
			ex.getMessage();

		}
		System.out.println("Balance for account number "
				+ account1.getAccountNumber() + " is :"
				+ account1.getAccountBalance());
		try {
			account1.withdrawAmount(1800);
		} catch (Exception ex) {
			// System.out.println(ex.getMessage());
			System.out.println(ex.getMessage());
		}
		System.out.println("Balance for account number "
				+ account1.getAccountNumber() + " is :"
				+ account1.getAccountBalance());
	}

}
