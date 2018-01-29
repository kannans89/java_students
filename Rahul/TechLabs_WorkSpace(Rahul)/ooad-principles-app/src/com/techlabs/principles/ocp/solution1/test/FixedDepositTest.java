package com.techlabs.principles.ocp.solution1.test;

import com.techlabs.principles.ocp.solution1.FestivalType;
import com.techlabs.principles.ocp.solution1.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
		FixedDeposit fd1 = new FixedDeposit(100000, 5, FestivalType.DIWALI);
		System.out.println("Total Intrest : "+fd1.calculateIntrest());
		System.out.println("==========================================");
		FixedDeposit fd2 = new FixedDeposit(100000, 5, FestivalType.HOLI);
		System.out.println("Total Intrest : "+fd2.calculateIntrest());


	}

}
