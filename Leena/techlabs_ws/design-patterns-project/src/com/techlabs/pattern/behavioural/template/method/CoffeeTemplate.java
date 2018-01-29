package com.techlabs.pattern.behavioural.template.method;

public abstract class CoffeeTemplate {
	
	public final void prepareCoffee(){
		boilWater();
		addMilk();
		addSugar();
		addPowder();
		
		System.out.println("Your Coffee is ready.....");
	}
	
	
	public abstract void boilWater();
	public abstract void addMilk();
	public abstract void addSugar();
	public abstract void addPowder();
	

}
