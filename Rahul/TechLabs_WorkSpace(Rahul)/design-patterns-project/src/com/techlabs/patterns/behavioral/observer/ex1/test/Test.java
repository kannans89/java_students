package com.techlabs.patterns.behavioral.observer.ex1.test;

import com.techlabs.patterns.behavioral.observer.ex1.Account;
import com.techlabs.patterns.behavioral.observer.ex1.AccountType;
import com.techlabs.patterns.behavioral.observer.ex1.IAccountObserver;

public class Test {

	public static void main(String[] args) {

		Account account1 = new Account(1001, AccountType.SAVINGS, "Kanan", 5000);
		account1.addAccountObserver(new ATMScreen());
		account1.addAccountObserver(new MobileScreen());
		//anonymous class or Inline method
		account1.addAccountObserver(new IAccountObserver() {
			
			@Override
			public void balanceChanged(Account acc) {
				System.out.println("---------------- Browser SCREEN ----------------");
				System.out
						.println("Please wait while we are updating the status of ue Account");
				System.out.println("Updating Status...........");
				System.out.println();
				System.out.println("Account Number : " + acc.getAccountNumber());
				System.out.println("Account Holder Name : "
						+ acc.getAccountHolderName());
				System.out.println("Account Type : " + acc.getAccountType());
				System.out.println("Current Balance :- Rs." + acc.getAccountBalance());
				System.out
						.println("====================================================");
				System.out.println();
				
			}
		});
		account1.depositAmount(3000);
		account1.withdrawAmount(1000);

		Account account2 = new Account(2002, AccountType.SAVINGS, "Pravin",
				2000);
		account2.addAccountObserver(new MobileScreen());
		account2.withdrawAmount(1500);
		account2.depositAmount(700);
		account2.withdrawAmount(1500);
	}

}
