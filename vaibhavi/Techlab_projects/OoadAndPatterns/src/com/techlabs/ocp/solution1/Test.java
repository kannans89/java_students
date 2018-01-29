package com.techlabs.ocp.solution1;

public class Test {

	public static void main(String[] args) {
		 DiscountCalculator calc=new DiscountCalculator();
		 System.out.println(calc.calculateDiscount(100, RuleType.NEWYEAR));
		 System.out.println(calc.calculateDiscount(100, RuleType.WEEKDAY));
		 System.out.println(calc.calculateDiscount(100, RuleType.WEEKEND));
	}

}
