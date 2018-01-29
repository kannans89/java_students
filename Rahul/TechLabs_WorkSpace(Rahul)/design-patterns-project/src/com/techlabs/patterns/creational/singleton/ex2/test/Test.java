package com.techlabs.patterns.creational.singleton.ex2.test;

import com.techlabs.patterns.creational.singleton.ex2.AnimalType;

public class Test {

	public static void main(String[] args) {
		AnimalType lion = AnimalType.LION;
		System.out.println("Lion is carnivoruus :" + lion.isCarnivorous());
		System.out.println("Lion " + System.identityHashCode(lion));

		AnimalType lion2 = AnimalType.LION;
		System.out.println("Lion is carnivoruus :" + lion2.isCarnivorous());
		System.out.println("Lion " + System.identityHashCode(lion2));

		AnimalType cow = AnimalType.COW;
		System.out.println("Cow is carnivoruus :" + cow.isCarnivorous());
		System.out.println("Cow " + System.identityHashCode(cow));

		System.out
				.println("==============================================================");

		for (AnimalType currentAnimal : AnimalType.values()) {

			if (currentAnimal.isCarnivorous()) {
				System.out.println(currentAnimal + " is Carnivorous");
			} else if (currentAnimal.isHarbivorous()) {
				System.out.println(currentAnimal + " is Harbivorous");
			} else {
				System.out.println(currentAnimal
						+ " is not Carnivorous,Harbivorous");
			}

		}

	}

}
