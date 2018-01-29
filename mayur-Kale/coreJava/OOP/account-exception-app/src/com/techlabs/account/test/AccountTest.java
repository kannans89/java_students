package com.techlabs.account.test;

import com.techlabs.account.Account;
public class AccountTest {

	public static void main(String[] args) {

		withdrawTest();
	}

	private static void withdrawTest() {
		Account account = new Account(10, "Mayur", 1000);
		try {
			account.withdraw(1100);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(account);

	}

}
