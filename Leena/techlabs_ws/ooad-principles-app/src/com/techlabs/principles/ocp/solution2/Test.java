package com.techlabs.principles.ocp.solution2;

public class Test {

	public static void main(String[] args) {
		
		//anonymous object 
		FixedDeposit deposite1=new FixedDeposit("Leena",100000, 3, new DiwaliFestival());
		System.out.println("Hii.."+deposite1.getName()+" , for Diwali Festival you can get rate of interest "+deposite1.getrate()+" for "+deposite1.getYears()+" years");
		System.out.println(" So Your Total Amount will be :"+deposite1.calculateInterest()+" for "+deposite1.getPrincipal()+"$");
		System.out.println("==================================");
		//Inline function..wherever ur interface is expected then u can create an anonimous class
		FixedDeposit deposite2=new FixedDeposit("Rahul", 100000, 5, new IFestivlesType() {
			@Override
			public double getRate() {
				
				return 0.10;
			}
		});
		
		System.out.println("Hii.."+deposite2.getName()+" , for any Festival you can get rate of interest "+deposite2.getrate()+" for "+deposite2.getYears()+" years");
		System.out.println(" So Your Total Amount will be :"+deposite2.calculateInterest()+" for "+deposite2.getPrincipal()+"$");
	
	
	
	}

}
