package com.techlabs.human.details.test;

import com.techlabs.human.details.Human;

public class Test {

	public static void main(String[] args) {

		Human h[] = new Human[2];
		h[0] = new Human("Pankaj", 5, 60);
		h[1] = new Human("Vaibhavi", 5, 50);
		printArr(h);

	}

	static void print(Human obj) {
		System.out.println("Name: " + obj.getName() + " Height: "
				+ obj.getHeight() + " Weight: " + obj.getWeight());
	}

	static void printArr(Human[] obj) {
		for (Human h : obj) {
			System.out.println(h);
		}
	}

	static void testHumanToString(Human Humanobj) {
		System.out.println(Humanobj);
	}

}
