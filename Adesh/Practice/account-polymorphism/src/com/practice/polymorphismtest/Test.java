package com.practice.polymorphismtest;

import com.practice.polymorphism.Account;
import com.practice.polymorphism.CurrentAccount;
import com.practice.polymorphism.SavingsAccount;

public class Test {

	public static void main(String[] args) {
		SavingsAccount acc1=new SavingsAccount(101,"adesh",5000);
		CurrentAccount acc2=new CurrentAccount(201,"kannan",2000);
		
		acc1.deposit(1000);
		acc2.deposit(1000);
		
		printDetails(acc1);
		printDetails(acc2);
		
		acc1.withdraw(5999);
		acc2.withdraw(2000);
		System.out.println("==============================");
		
		printDetails(acc1);
		printDetails(acc2);

	}

	private static void printDetails(Account account) {
		System.out.println("Account no.= "+account.getAccountNo());
		System.out.println("Account name = "+account.getName());
		System.out.println("Account balance = "+account.getBalance());
	}

}
