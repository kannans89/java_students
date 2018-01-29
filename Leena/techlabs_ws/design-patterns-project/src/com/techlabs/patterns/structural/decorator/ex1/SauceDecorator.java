package com.techlabs.patterns.structural.decorator.ex1;

public class SauceDecorator extends SandwitchDecorator{
	
	public SauceDecorator(ISandwitch customSandwitch) {
		super(customSandwitch);
	}
	
	public String makeSandwitch(){
		
		return customSandwitch.makeSandwitch()+addSauces();
	}

	private String addSauces() {
		return " -->ChilliSauce+SoyaSauce";
	}

	public double getPrice(){
		return customSandwitch.getPrice()+addSaucePrice();
	}

	private double addSaucePrice() {
		return 15.0;
	}
}
