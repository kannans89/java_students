package com.techlabs.patterns.behavioural.template;

public class Nescafe extends CofeeTemplate{

	@Override
	public void boilWater() {
System.out.println("1 ltr water is boiling........");		
	}

	@Override
	public void addMilk() {
System.out.println("Adding 50ml milk........");		
	}

	@Override
	public void addSugar() {
System.out.println("Adding sugar........");		
	}

	@Override
	public void addCofeePowder() {
System.out.println("Adding nescafe cofee...........");		
	}

}
