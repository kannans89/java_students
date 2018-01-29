package com.practice.patterns.creational.singleton.ex2.test;

import com.practice.patterns.creational.singleton.ex2.AnimalType;

public class TestAnimal {

	public static void main(String[] args) {
		AnimalType currentAnimal = AnimalType.LION;
		System.out.println("is "+currentAnimal+" carnivorous = "+currentAnimal.isCarnivorous()+", Hashcode is = "+currentAnimal.hashCode());
		
		AnimalType animal2 = AnimalType.CAT;
		System.out.println("is "+animal2+" carnivorous = "+animal2.isCarnivorous()+", hashcode = "+animal2.hashCode());
		
		for(AnimalType animal:AnimalType.values()){
			System.out.println("is "+animal+" carnivorous = "+animal.isCarnivorous()+", hashcode = "+animal.hashCode());
		}
	}

}
