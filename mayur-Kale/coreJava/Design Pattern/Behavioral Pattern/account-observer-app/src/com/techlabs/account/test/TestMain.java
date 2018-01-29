package com.techlabs.account.test;

import com.techlabs.account.Account;
import com.techlabs.account.EmailListener;
import com.techlabs.account.SMSListener;

public class TestMain {

	public static void main(String[] args) {

		Account account = new Account(10, "Mayur", 1000);
		account.addListener(new EmailListener());
		account.addListener(new SMSListener());
		account.deposit(1000);
		account.withdraw(500);
	}

}
