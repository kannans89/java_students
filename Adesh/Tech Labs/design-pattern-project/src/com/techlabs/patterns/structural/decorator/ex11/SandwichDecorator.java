package com.techlabs.patterns.structural.decorator.ex11;

public abstract class SandwichDecorator implements ISandwich{
	protected ISandwich customSandwich;
	
	public SandwichDecorator(ISandwich sandwich){
		this.customSandwich = sandwich;
	}
}
