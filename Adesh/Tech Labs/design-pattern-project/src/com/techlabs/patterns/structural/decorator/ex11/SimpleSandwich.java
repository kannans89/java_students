package com.techlabs.patterns.structural.decorator.ex11;

public class SimpleSandwich implements ISandwich{

	public String makeSandwich() {
		return "Bread";
	}

	public double getPrice() {
		return 25;
	}

}
