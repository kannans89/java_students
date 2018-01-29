package com.techlabs.pattern.behavioural.template.method;

public class BruCoffee extends CoffeeTemplate{
	
	@Override
	public void boilWater(){
		System.out.println("Boiling a water");
	}
	
	@Override
	public void addMilk(){
		System.out.println("Adding milk into water");
	}
	
	@Override
	public void addSugar(){
		System.out.println("Adding Sugar into Mixture");
	}
	
	@Override
	public void addPowder(){
		System.out.println("BruCoffee powder is added ");
	}
	

}
