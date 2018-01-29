package com.techlabs.patterns.creational.abstract_factory;

public abstract class AnimalAbstractFactory {
	
	public static AnimalAbstractFactory  createFactory(AnimalFactory type)
	{
		AnimalAbstractFactory factory=null;
		
		if(type==AnimalFactory.LANDANIMALS)
		{
			factory=new LandAnimalFactory();
		}
		if(type==AnimalFactory.SEAANIMALS)
		{
			factory=new SeaAnimalAbstractFactory();
		}
		
		return factory;
	}
	
	public abstract Animal createAnimal(Animals type);

}
