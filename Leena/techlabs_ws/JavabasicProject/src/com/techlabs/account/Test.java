package com.techlabs.account;

public class Test {

	public static void main(String[] args) {
		
		Account[] myAccount;
		myAccount=new Account[3];
		
		myAccount[0]=new Account(001, "Mr.A", 100);
		myAccount[1]=new Account(002, "Mr.B", 200);
		myAccount[2]=new Account(003, "Mr.c", 300);
		
		for(Account temp:myAccount){
			displayDetails(temp);
		}
		//testAnnonymousAcc();
		//testAccount();
		
		
		
	}
	
	public static void testAnnonymousAcc(){
		displayDetails(new Account(1003,"Bhawesh",6000));
	}
	// For passing the whole object details of class we can create a variable of type class...example- Account
	
	public static void displayDetails(Account acc){
		System.out.println("Id of the Account :"+acc.getId());
		
		System.out.println("Customer Name Is :"+acc.getName());
		
		System.out.println("Your Current A/C Balance :"+acc.getBalance());
		System.out.println("================================================");
		
	}
	
	public static void changedBalance(Account acc){
		
		acc.setBalance(0);
		System.out.println("Into the Function : ");
		System.out.println();
		displayDetails(acc);
	}
	
	public static void testAccount(){
		
		Account acc1=null;
		acc1=new Account(1001,"Leena",5000);
		System.out.println("Before Function Call :");
		System.out.println();
		displayDetails(acc1);
		changedBalance(acc1);
		System.out.println("After Function Call : ");
		System.out.println();
		displayDetails(acc1);
		//Account acc2=new Account(1002, "Sheetal",5006);
		//displayDetails(acc2);
	}
}
