package com.techlabs.patterns.structural.decorator.ex1;

public class VegDecorator extends SandwitchDecorator{

	public VegDecorator(ISandwitch customSandwitch) {
			super(customSandwitch);
	}
	
	public String makeSandwitch(){
		return customSandwitch.makeSandwitch()+addVegitables();
	}

	private String addVegitables() {
		return " -->Capsicum+Tomato+BitRoot";
	}
	
	public double getPrice(){
		return customSandwitch.getPrice()+addVegitablesPrice();
	}

	private double addVegitablesPrice() {
		return 15.0;
	}
	
	
}
