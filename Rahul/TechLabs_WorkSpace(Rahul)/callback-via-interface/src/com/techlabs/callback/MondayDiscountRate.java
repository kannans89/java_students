package com.techlabs.callback;

public class MondayDiscountRate implements IDiscountRate {
	@Override
	public double getRate(){
		return 50;
	}
}
