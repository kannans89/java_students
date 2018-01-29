package com.techlabs.patterns.behavioral.strategy;

public class LowDiscount implements IdiscountStrategy {

	@Override
	public double getDiscountRate() {
		return 0.1;
	}

}
