package com.techlabs.account.test;

import com.techlabs.account.Account;
import com.techlabs.account.InSufficentException;

public class AccountTest {

	public static void main(String[] args) {

		withdrawTest();
	}

	private static void withdrawTest() {
		Account account = new Account(10, "Mayur", 1000);
		try {
			account.withdraw(1100);
		} catch (InSufficentException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		System.out.println(account);

	}

}
