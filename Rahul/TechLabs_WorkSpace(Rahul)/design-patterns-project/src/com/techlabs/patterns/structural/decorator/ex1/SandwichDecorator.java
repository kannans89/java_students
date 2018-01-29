package com.techlabs.patterns.structural.decorator.ex1;

public abstract class SandwichDecorator implements ISandwich {
	ISandwich sandwich;

	public SandwichDecorator(ISandwich wrapTO) {
		sandwich = wrapTO;
	}
}
