package com.techlabs.account.test;

import com.techlabs.account.FixedDeposit;
import com.techlabs.account.interest.rates.DiwaliRate;
import com.techlabs.account.interest.rates.NewYearRate;
import com.techlabs.account.interest.rates.NormalRate;

public class Test {
	public static void main(String args[]){
		
		FixedDeposit fd1=new FixedDeposit(1000,5,new DiwaliRate());
		FixedDeposit fd2=new FixedDeposit(1000,5,new NormalRate());
		FixedDeposit fd3=new FixedDeposit(1000,5,new NewYearRate());
		
		System.out.println("Result: "+ fd1.calcInterest());
		System.out.println("Result: "+ fd2.calcInterest());
		System.out.println("Result: "+ fd3.calcInterest());
	}

}
