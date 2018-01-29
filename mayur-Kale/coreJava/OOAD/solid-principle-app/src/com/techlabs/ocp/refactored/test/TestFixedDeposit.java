package com.techlabs.ocp.refactored.test;

import com.techlabs.ocp.refactored.DiwaleRate;
import com.techlabs.ocp.refactored.FixedDeposit;
import com.techlabs.ocp.refactored.HoliRate;

public class TestFixedDeposit {

	public static void main(String[] args) {
		FixedDeposit depositOne = new FixedDeposit(1000, 10, new DiwaleRate());
		System.out.println("Total Interest:" + depositOne.calcTotalInterest());
		FixedDeposit depositTwo = new FixedDeposit(4000, 4, new HoliRate());
		System.out.println("Total Interest:" + depositTwo.calcTotalInterest());
	}

}
