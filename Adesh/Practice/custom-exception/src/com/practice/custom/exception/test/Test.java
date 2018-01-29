package com.practice.custom.exception.test;

import com.practice.custom.exception.Account;
import com.practice.custom.exception.InsufficientFundsException;

public class Test {

	public static void main(String[] args) /*throws Exception*/ {
		Account acc1=new Account(101,"adesh",5000);
		
		try{
		acc1.withdraw(7000);
		System.out.println("Account no is = "+acc1.getAccNo()+"\nAccount name is = "+acc1.getAccName()+"\nAccount balance is = "+acc1.getBal());
		}catch(InsufficientFundsException iex){
			System.out.println(iex.getMessage());
		}/*catch(Exception ex){
			System.out.println("Error: no funds transfer");
		}*/
		
	}

}
