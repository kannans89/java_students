package com.techlabs.ocp.solution2;

public class NewYear implements IDiscount {

	double discount=0.4;
	
	@Override
	public double getDiscount() {
		return discount;
	}

}
