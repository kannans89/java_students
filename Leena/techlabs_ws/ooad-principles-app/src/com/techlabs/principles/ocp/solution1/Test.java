package com.techlabs.principles.ocp.solution1;

public class Test {

	public static void main(String[] args) {
		
		FixedDeposit deposit=new FixedDeposit(100000, 3,FestivalsType.DIWALI );
		System.out.println("In Diwali your rateOfInterest is : "+deposit.calculateInterest());
		System.out.println("rate is : "+deposit.getRate());
		
		FixedDeposit deposit1=new FixedDeposit(200000, 5, FestivalsType.NEWYEAR);
		System.out.println("In NewYear your rateOfInterest is : "+deposit1.calculateInterest());
		System.out.println("rate is : "+deposit1.getRate());
		
	}

}
