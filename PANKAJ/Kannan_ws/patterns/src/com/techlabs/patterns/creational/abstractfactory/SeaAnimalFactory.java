package com.techlabs.patterns.creational.abstractfactory;

public class SeaAnimalFactory extends AbstractFactory {

	@Override
	public Animal createAnimal(AnimalType type) {
		if(type==AnimalType.DOLPHIN)
			return new Dolphin();
		else 
		return new Shark();
	}

}
