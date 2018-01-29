package com.techlabs.custom.exception.test;

import com.techlabs.custom.exception.Account;
import com.techlabs.custom.exception.InsufficientFundsException;

public class AccountTest {

	public static void main(String[] args) /* throws Exception */
	{
		Account accNo = new Account(11, "adesh", 5000);
		try {
			accNo.withdraw(20000);
			System.out.println("Balance is = " + accNo.getBalance());
		} catch (InsufficientFundsException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
