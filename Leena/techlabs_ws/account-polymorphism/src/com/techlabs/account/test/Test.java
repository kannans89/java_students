package com.techlabs.account.test;

import com.techlabs.account.CurrentAccount;
import com.techlabs.account.SavingAccount;
import com.techlabs.account.Account;

public class Test {

	public static void main(String[] args) {
	
		SavingAccount savingaccount1=new SavingAccount(101,"Leena",5000);
		CurrentAccount currentaccount1=new CurrentAccount(102, "Aadesh", 6000);
		SavingAccount savingaccount2=new SavingAccount(103,"Kannan",5000);
		CurrentAccount currentaccount2=new CurrentAccount(104, "Rahul", 8000);
		displayDetails(savingaccount1);
		/*displayDetails(savingaccount2);
		displayDetails(currentaccount1);
		displayDetails(currentaccount2);
		*/System.out.println("After changing Balance ");
		 savingaccount1.withdraw(1000);
		/*displayDetails(savingaccount1);
		savingaccount2.withdraw(200);
		displayDetails(savingaccount2);
		currentaccount1.withdraw(1000);
		displayDetails(currentaccount1);
		currentaccount2.withdraw(5000);
		displayDetails(currentaccount2);
		*/savingaccount1.deposite(6000);
		displayDetails(savingaccount1);
		
	}

	public static void displayDetails(Account acc){
		System.out.println("Current Account No. :"+acc.getAccountNumber());
		System.out.println("Name of Customer : "+acc.getCustomerName());
		System.out.println("Balance of Customer :"+acc.getBalance());
		System.out.println("===============================================================");
	}
	
}
