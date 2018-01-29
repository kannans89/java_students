package com.techlabs.principles.ocp.solution1.test;

import com.techlabs.principles.ocp.solution1.FestivalType;
import com.techlabs.principles.ocp.solution1.FixedDeposit;

public class TestFixedDeposit {

	public static void main(String[] args) {

		FixedDeposit fixedDeposit = new FixedDeposit(100000, 5,FestivalType.DIWALI);

		System.out.println("Rate of interest = "+ fixedDeposit.calculateInterest());
		System.out.println("Rate = " + fixedDeposit.getRate());
		System.out.println("Rate of interest for 101 = "
				+ (new FixedDeposit(50000, 5, FestivalType.GANPATI))
						.calculateInterest());
	}

}
