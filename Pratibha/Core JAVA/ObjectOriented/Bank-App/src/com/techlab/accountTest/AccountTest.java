package com.techlab.accountTest;

import com.techlab.account.*;

public class AccountTest {
	public static void main(String args[]) throws InsufficientFundException {

		SavingAccount sa1 = new SavingAccount(123, "Pratibha", 1000);
		CurrentAccount ca1 = new CurrentAccount(111, "Shweta", 10000);
	//	Account[] acc = new Account[2];

		// sa1.withdraw(10500);
		System.out.println(sa1.getAccNo() + "  " + sa1.getName() + "  "
				+ sa1.getBalance());
		ca1.withdraw(12000);
		System.out.println(ca1.getAccNo() + "  " + ca1.getName() + "  "
				+ ca1.getBalance());
		try {
			sa1.withdraw(1000);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}

	}

}
