package com.techlabs.patterns.creational.abstractfactory;

public class LandAnimalFactory extends AbstractFactory {

	@Override
	public Animal createAnimal(AnimalType type) {
		if(type==AnimalType.LION)
			return new Lion();
		else
			return new Tiger();
	}

}
