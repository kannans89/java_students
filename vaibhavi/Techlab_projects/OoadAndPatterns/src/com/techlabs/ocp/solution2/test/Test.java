package com.techlabs.ocp.solution2.test;

import com.techlabs.ocp.solution2.DiscountCalculator;
import com.techlabs.ocp.solution2.ChristmasDiscount;
import com.techlabs.ocp.solution2.IDiscount;
import com.techlabs.ocp.solution2.WeekendDiscount;

public class Test {

	public static void main(String[] args) {

		DiscountCalculator calc=new DiscountCalculator();
		IDiscount weekendDiscount=new WeekendDiscount();
		IDiscount christmasDiscount=new ChristmasDiscount();
		System.out.println(calc.calculateDiscount(100, weekendDiscount));
		System.out.println(calc.calculateDiscount(100, christmasDiscount));
		
		
	}

}
