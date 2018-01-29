package com.techlabs.patterns.creational.abstractfactory;

public abstract class AbstractFactory {
	
	abstract public Animal createAnimal(AnimalType type);
	
	public static AbstractFactory createFactory(AnimalType type){
		if(type==AnimalType.LAND)
			return new LandAnimalFactory();
		else
			return new SeaAnimalFactory();
	}
	
}
