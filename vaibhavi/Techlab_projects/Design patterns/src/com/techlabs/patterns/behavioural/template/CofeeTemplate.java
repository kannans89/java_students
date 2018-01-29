package com.techlabs.patterns.behavioural.template;

public abstract class CofeeTemplate {

	final void prepareCofee()
	{
		boilWater();
		addMilk();
		addSugar();
		addCofeePowder();
		System.out.println("wait...");
		System.out.println("Cofee is ready");
	}
	public abstract void boilWater();
	
	
	public abstract void addMilk();

	
	public abstract void addSugar();
	public abstract void addCofeePowder();
}
