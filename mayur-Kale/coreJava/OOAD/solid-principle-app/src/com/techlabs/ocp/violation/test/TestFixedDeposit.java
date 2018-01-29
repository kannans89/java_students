package com.techlabs.ocp.violation.test;

import com.techlabs.ocp.violation.FestivalType;
import com.techlabs.ocp.violation.FixedDeposit;

public class TestFixedDeposit {

	public static void main(String[] args) {
		FixedDeposit depositOne = new FixedDeposit(10000, 12,
				FestivalType.DIWALI);
		System.out.println("Total Interest:" + depositOne.calcTotalInterest());
	}

}
