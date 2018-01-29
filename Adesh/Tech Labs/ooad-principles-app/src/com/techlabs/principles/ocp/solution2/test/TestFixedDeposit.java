package com.techlabs.principles.ocp.solution2.test;

import com.techlabs.principles.ocp.solution2.DiwaliFestival;
import com.techlabs.principles.ocp.solution2.FixedDeposit;
import com.techlabs.principles.ocp.solution2.GanpatiFestval;
import com.techlabs.principles.ocp.solution2.IFestival;

public class TestFixedDeposit {

	public static void main(String[] args) {

		FixedDeposit fixedDeposit = new FixedDeposit(100000, 5,
				new DiwaliFestival());
		System.out.println("Rate of Interest in Diwali = "
				+ fixedDeposit.calculateInterest());

		// By passing Inner class
		FixedDeposit fd2 = new FixedDeposit(50000, 4, new IFestival() {
			public double getRate() {
				return 0.05;
			}
		});

		System.out.println("Rate of Interest for fd2 = "
				+ fd2.calculateInterest());
		System.out.println("Rate of Interest in Ganpati = "
				+ (new FixedDeposit(90000, 2, new GanpatiFestval()))
						.calculateInterest());
	}

}
