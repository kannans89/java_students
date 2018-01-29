package com.practice.patterns.behavioural.template.ex1;

public class BruCoffee extends CoffeeTemplate{

	@Override
	public void boilWater() {
		System.out.println("Adding 200ml water..");
	}

	@Override
	public void addPowder() {
		System.out.println("Bru Coffee is added..");
	}

}
