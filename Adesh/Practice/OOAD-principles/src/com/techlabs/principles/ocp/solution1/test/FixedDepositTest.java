package com.techlabs.principles.ocp.solution1.test;

import com.techlabs.principles.ocp.solution1.FestivalType;
import com.techlabs.principles.ocp.solution1.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
		
		FixedDeposit fd1 = new FixedDeposit(120000, 4, FestivalType.GANPATI);
		
		System.out.println("Total amount "+fd1.calculateRateOfInterest()+" with the rate of interest "+fd1.getRate()+" on the occasion of "+FestivalType.GANPATI);
		
		System.out.println("Total amount "+new FixedDeposit(10000,5,FestivalType.NEW_YEAR).calculateRateOfInterest()+" on the occasion of "+FestivalType.NEW_YEAR);
	}

}
