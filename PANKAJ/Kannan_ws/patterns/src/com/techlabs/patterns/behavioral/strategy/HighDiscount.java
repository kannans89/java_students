package com.techlabs.patterns.behavioral.strategy;

public class HighDiscount implements IdiscountStrategy {

	@Override
	public double getDiscountRate() {
		return 0.5;
	}

}
