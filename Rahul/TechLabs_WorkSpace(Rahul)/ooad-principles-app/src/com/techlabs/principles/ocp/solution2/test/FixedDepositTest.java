package com.techlabs.principles.ocp.solution2.test;

import com.techlabs.principles.ocp.solution2.Diwali;
import com.techlabs.principles.ocp.solution2.FixedDeposit;
import com.techlabs.principles.ocp.solution2.IFestivalRate;

public class FixedDepositTest {

	public static void main(String[] args) {
		FixedDeposit fd1 = new FixedDeposit(100000, 5, new Diwali());
		System.out.println("Intrest :"+fd1.calculateIntrest());
		
		//Annonymus class//InLine function
		FixedDeposit fd2 = new FixedDeposit(200000, 3, new IFestivalRate() {
			
			@Override
			public double getRateOfIntrest() {
				
				return (6.0/100);
			}
		});
		
		System.out.println("==========================================");
		System.out.println("Intrest :"+fd2.calculateIntrest());

	}


}