package com.practice.patterns.behavioural.template.ex1;

public class NesCoffee extends CoffeeTemplate{

	@Override
	public void boilWater() {
		System.out.println("Adding 500ml water..");
	}

	@Override
	public void addPowder() {
		System.out.println("NesCoffee is added..");
	}

}
