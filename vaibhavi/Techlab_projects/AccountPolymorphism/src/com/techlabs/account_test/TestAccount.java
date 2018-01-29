package com.techlabs.account_test;

import com.techlab.accountpolymorphism.Account;
import com.techlab.accountpolymorphism.CurrentAccount;
import com.techlab.accountpolymorphism.SavingsAccount;

public class TestAccount {

	public void testCurrentAccount()
	{
		CurrentAccount ca=new CurrentAccount("vaibhavi",5000);
		printStatement(ca);
		ca.deposit(500);
		try
		{
		ca.widraw(500);
		}
		catch(Exception ex)
		{
	       System.out.println(ex.getMessage());
		}
		
		
		System.out.println(ca.getBalance());
	}
	
	public void testSavingsAccount()
	{
		SavingsAccount sa=new SavingsAccount("Ashmita",2000);
		printStatement(sa);
		sa.deposit(500);
		try{
		sa.widraw(2500);
		}
		catch(Exception ex)
		{
	       System.out.println(ex.getMessage());
		}
		System.out.println(sa.getBalance());
	}
	
	public static void printStatement(Account a)
	{
		System.out.println("printing name and balance.....");
		System.out.println("Name is"+ a.getName());
		System.out.println("Balance is"+ a.getBalance());
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            TestAccount ta=new TestAccount();
            ta.testCurrentAccount();
            ta.testSavingsAccount();
		
	}

}
