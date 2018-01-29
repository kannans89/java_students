package com.techlabs.patterns.creational.abstract_factory;

public class Test {

	public static void main(String[] args) {

		AnimalAbstractFactory factory= AnimalAbstractFactory.createFactory(AnimalFactory.SEAANIMALS);
		Animal animal=factory.createAnimal(Animals.OCTOPUS);
		animal.move();
		
	}

}
