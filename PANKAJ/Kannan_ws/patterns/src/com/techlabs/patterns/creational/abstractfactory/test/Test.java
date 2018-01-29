package com.techlabs.patterns.creational.abstractfactory.test;

import com.techlabs.patterns.creational.abstractfactory.AbstractFactory;
import com.techlabs.patterns.creational.abstractfactory.Animal;
import com.techlabs.patterns.creational.abstractfactory.AnimalType;

public class Test {

	public static void main(String args[]) {
		
		AbstractFactory factory = AbstractFactory.createFactory(AnimalType.LAND);
		Animal animal=factory.createAnimal(AnimalType.TIGER);
		
		animal.move();
		
		factory = AbstractFactory.createFactory(AnimalType.SEA);
		animal=factory.createAnimal(AnimalType.DOLPHIN);
		
		animal.move();
		
	}
}
