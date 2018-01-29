package com.techlabs.patterns.creational.abstract_factory;

public class SeaAnimalAbstractFactory extends AnimalAbstractFactory{

	@Override
	public Animal createAnimal(Animals type) {
		// TODO Auto-generated method stub
		Animal animal=null;
		if(type==Animals.OCTOPUS)
		{
			animal=new Octopus();
	   }
		
		if(type==Animals.SHARK)
		{
			animal=new Shark();
	   }
		
		return animal;
	}

}
