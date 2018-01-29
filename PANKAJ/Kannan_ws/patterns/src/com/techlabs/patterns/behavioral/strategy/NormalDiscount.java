package com.techlabs.patterns.behavioral.strategy;

public class NormalDiscount implements IdiscountStrategy {

	@Override
	public double getDiscountRate() {
		return 0.2;
	}

}
