package com.techlabs.ocp.solution2;

public class Christmas implements IDiscount {

	double discount=0.35;
	@Override
	public double getDiscount() {
		return discount;
	}

}
