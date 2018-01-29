package com.techlabs.patterns.creational.abstract_factory;

public class LandAnimalFactory extends AnimalAbstractFactory {

	@Override
	public Animal createAnimal(Animals type) 
	{
		Animal animal=null;
		if(type==Animals.CAT)
		{
			animal=new Cat();
	   }
		if(type==Animals.DOG)
		{
			animal=new Dog();
		}
		if(type==Animals.LION)
		{
			animal=new Lion();
		}
		
		return animal;

}
}
