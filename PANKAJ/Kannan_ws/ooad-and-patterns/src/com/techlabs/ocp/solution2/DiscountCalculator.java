package com.techlabs.ocp.solution2;

public class DiscountCalculator {

	public static double calcDiscount(double amt,IDiscount type){
		return amt - amt*type.getDiscount();
	}
}
