package com.techlabs.patterns.structural.decorator.ex1;

public class SimpleSandwitch implements ISandwitch{

	@Override
	public String makeSandwitch(){
		return "Bread";
	}
	
	@Override
	public double getPrice(){
		return 25.0;
	}
}
