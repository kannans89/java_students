package com.techlabs.patterns.behavioral.template;

public class Nescafe extends CoffeeTemplate {

	@Override
	public void boilWater() {
		System.out.println("Boiling water");
	}

	@Override
	public void addMilk() {
		System.out.println("Adding milk");
	}

	@Override
	public void addCoffee() {
		System.out.println("Adding Nescafe coffee");
	}

}
