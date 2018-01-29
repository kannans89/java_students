package com.techlabs.callbacks;

public class TestCallbacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NewYearRate n=new NewYearRate();
		DiwaliRate d=new DiwaliRate();
		FixedDeposit fd1=new FixedDeposit(50000, 2, n);
		FixedDeposit fd2=new FixedDeposit(100000,3,d);
	
		System.out.println(fd1.calculateInterest());
		System.out.println(fd2.calculateInterest());
		
	}

}
