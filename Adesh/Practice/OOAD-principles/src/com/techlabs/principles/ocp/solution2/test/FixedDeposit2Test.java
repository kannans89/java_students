package com.techlabs.principles.ocp.solution2.test;

import com.techlabs.principles.ocp.solution2.DiwaliFestival;
import com.techlabs.principles.ocp.solution2.FixedDeposit2;
import com.techlabs.principles.ocp.solution2.IFestivalType;

public class FixedDeposit2Test {

	public static void main(String[] args) {

		FixedDeposit2 fd1 = new FixedDeposit2(120000, 3, new DiwaliFestival());

		System.out.println("Amount is " + fd1.calculateRateOfInterest()
				+ " with the rate of interest is "
				+ new DiwaliFestival().getRate()
				+ " on the occassion of Diwali");
		//inner class
		FixedDeposit2 fd2 = new FixedDeposit2(30000, 2, new IFestivalType() {
			
			public double getRate() {
				return 0.03;
			}
		});
		System.out.println("Amount is "+fd2.calculateRateOfInterest());
	}

}
