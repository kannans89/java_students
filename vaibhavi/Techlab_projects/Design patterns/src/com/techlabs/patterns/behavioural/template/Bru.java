package com.techlabs.patterns.behavioural.template;

public class Bru extends CofeeTemplate{

	@Override
	public void boilWater() {
		System.out.println("2 ltr water is boiling........");			
	}

	@Override
	public void addMilk() {
		System.out.println("Adding 1ml milk........");				
	}

	@Override
	public void addSugar() {
		System.out.println("Adding sugar........");			
	}

	@Override
	public void addCofeePowder() {
		System.out.println("Adding Bru cofee...........");			
	}

}
