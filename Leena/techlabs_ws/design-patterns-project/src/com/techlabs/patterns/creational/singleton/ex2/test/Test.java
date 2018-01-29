package com.techlabs.patterns.creational.singleton.ex2.test;

import com.techlabs.patterns.creational.singleton.ex2.AnimalType;

public class Test {

	public static void main(String[] args) {

		for (AnimalType animal : AnimalType.values()) {

			if (animal.chaeckCarnivorous()) {
				System.out.println(animal + " is carnivorous");
			} else {
				System.out.println(animal + " is not carnivorous");
			}

		}

	}

}
