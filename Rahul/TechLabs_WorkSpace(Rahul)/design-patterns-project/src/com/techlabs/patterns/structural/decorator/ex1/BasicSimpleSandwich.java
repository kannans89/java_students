package com.techlabs.patterns.structural.decorator.ex1;

public class BasicSimpleSandwich implements ISandwich {

	@Override
	public String makeSandwich() {

		return "Bread";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 15.00;
	}

}
