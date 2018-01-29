package com.techlabs.account.test;

import com.techlabs.account.Account;
import com.techlabs.account.CurrentAccount;
import com.techlabs.account.SavingAccount;

public class AccountTest {
	public static void main(String[] args) {
		SavingAccount savingAcc1 = new SavingAccount(101, "Adesh", 5000);
		SavingAccount savingAcc2 = new SavingAccount(102, "Leena", 2000);
		CurrentAccount currentAcc1 = new CurrentAccount(103, "Kanan", 7000);
		CurrentAccount currentAcc2 = new CurrentAccount(104, "Rahul", 1000);
		System.out.println("Start--------->>>>");
		print(savingAcc1);
		print(savingAcc2);
		print(currentAcc1);
		print(currentAcc2);
		System.out.println("========Deposite 300 to 101 =======");
		savingAcc1.depositAmount(300);
		print(savingAcc1);
		System.out.println("========= Withdraw 700 from 102 =========");
		savingAcc2.withdrawAmount(700);
		print(savingAcc2);
		System.out.println("==============Withdraw 5000 from 101===== ");
		savingAcc1.withdrawAmount(5000);
		print(savingAcc1);
		System.out.println("==============Withdraw 800===========");
		currentAcc2.withdrawAmount(800);
		print(currentAcc2);
		System.out.println("=========Withdraw 7500======== ");
		currentAcc1.withdrawAmount(7500);
		print(currentAcc1);
		

	}
	public static void print(Account account){
		System.out.println("Account Holder Name: "+account.getAccountHolderName());
		System.out.println("Account Number: "+account.getAccountNumber());
		System.out.println("Account Balance: "+account.getAccountBalance());
		
	}

}
