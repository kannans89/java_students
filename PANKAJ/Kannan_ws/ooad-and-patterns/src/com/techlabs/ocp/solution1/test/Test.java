package com.techlabs.ocp.solution1.test;

import com.techlabs.ocp.solution1.DiscountCalculator;
import com.techlabs.ocp.solution1.RuleType;

public class Test {

	public static void main(String[] args) {

		DiscountCalculator obj = new DiscountCalculator();
		System.out.println("Price on weekday is :"+obj.calcDiscount(100, RuleType.WEEKDAY));
		System.out.println("Price on weekend is :"+obj.calcDiscount(100, RuleType.WEEKEND));
		System.out.println("Price on New Year is :"+obj.calcDiscount(100, RuleType.NEWYEAR));
	}

}
