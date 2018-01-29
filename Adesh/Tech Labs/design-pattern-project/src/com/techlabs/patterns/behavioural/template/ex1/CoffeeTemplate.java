package com.techlabs.patterns.behavioural.template.ex1;

public abstract class CoffeeTemplate {
	public final void prepareCoffee(){
		boilWater();
		addMilk();
		addSugar();
		addPowder();
		System.out.println("Coffee is ready..!!");
	}

	private void addPowder() {
		System.out.println("Adding powder in the coffee..");
	}

	private void addSugar() {
		System.out.println("Adding sugar in the coffee..");
	}

	private void addMilk() {
		System.out.println("Adding milk in the coffee..");
	}

	public abstract void boilWater();
	
}
