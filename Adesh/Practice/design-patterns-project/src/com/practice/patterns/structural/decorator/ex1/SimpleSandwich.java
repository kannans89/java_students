package com.practice.patterns.structural.decorator.ex1;

public class SimpleSandwich implements ISandwich{

	public String makeSandwich() {
		return "\nBread";
	}

	public double getPrice() {
		return 25;
	}

}
