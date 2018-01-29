package com.techlabs.patterns.creational.singleton.ex2.test;

import com.techlabs.patterns.creational.singleton.ex2.AnimalType;

public class AnimalTest {

	public static void main(String[] args) {
		
		/*AnimalType currentAnimal = AnimalType.LION;
		System.out.println("is Lion carnivorous = "+currentAnimal.isCarnivorous(AnimalType.LION));
		System.out.println("Hashcode of the currentAnimal = "+System.identityHashCode(currentAnimal));
		
		AnimalType currentAnimal2 = AnimalType.LION;
		System.out.println("Hashcode currentAnimal2 = "+System.identityHashCode(currentAnimal2));
		
		AnimalType animal2 = AnimalType.CAT;
		System.out.println("is cat carnivorous = "+animal2.isCarnivorous(AnimalType.CAT));
		System.out.println("Hashcode of cat = "+System.identityHashCode(animal2));
		
		for(AnimalType animal:AnimalType.values()){
			System.out.println(animal+" is carnivorous = "+animal.isCarnivorous(animal));
			System.out.println(animal+" is omnivorous = "+animal.isOmnivorous(animal));
			
		}*/
		
		AnimalType currentAnimal = AnimalType.LION;
		System.out.println("is Lion carnivorous = "+currentAnimal.checkCarnivorous());
	}

}
