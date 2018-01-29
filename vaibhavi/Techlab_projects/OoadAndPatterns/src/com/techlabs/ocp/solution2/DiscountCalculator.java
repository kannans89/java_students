package com.techlabs.ocp.solution2;

public class DiscountCalculator {
	
	public double calculateDiscount(double amount,IDiscount type)
	{
		return (amount*type.getDiscount())/100;
	}

}
