package com.techlabs.ocp.solution2;

public class Weekend implements IDiscount {

	double discount = 0.15;
	@Override
	public double getDiscount() {
		return discount;
	}

}
