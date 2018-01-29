package com.techlabs.patterns.behavioural.stratergy;

public class NormalDiscount implements IDiscountStratergy{

	@Override
	public double getDiscount() {
	
		return 0.50;
	}

}
