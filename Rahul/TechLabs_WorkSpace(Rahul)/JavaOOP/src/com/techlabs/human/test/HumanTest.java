package com.techlabs.human.test;

import com.techlabs.human.Human;

public class HumanTest {

	public static void main(String[] args) {
		makeHumanArray();
		anonymousHumanObject();

	}

	public static void printHuman(Human human) {

		System.out.println("ID :- " + human.getId());
		System.out.println("Name :- " + human.getName());
		System.out.println("Height :- " + human.getHeight());
		System.out.println("Weight :- " + human.getWeight());
		System.out
				.println("---------------------------------------------------");

	}

	public void addHumanObject() {
		Human humanObj1 = new Human(1, "Rahul", 5, 60);
		Human humanObj2 = new Human(2, "Vijay", 6, 55);
		Human humanObj3 = new Human(3, "Sammer", 4, 67);
		Human humanObj4 = new Human(4, "Sunny", 6, 70);

		humanObj1.eatFood();
		humanObj1.play();
		printHuman(humanObj1);
		printHuman(humanObj2);
		printHuman(humanObj3);
		printHuman(humanObj4);
	}

	public static void anonymousHumanObject() {
		System.out.println("Anonomous Object :-");
		System.out.println(new Human(5, "Dev", 5, 66).getName());
		// System.out.println(humanObj1);
		// System.out.println(humanObj2);
		System.out.println(new Human(6, "Vishal", 6, 71).getWeight());
	}

	public static void printManyHuman(Human[] hArray) {
		for (Human obj : hArray) {
			printHuman(obj);
		}
	}

	public static void makeHumanArray() {
		Human[] humanArray = new Human[5];
		humanArray[0] = new Human(1, "Rahul", 5, 60);
		humanArray[1] = new Human(2, "Vijay", 6, 55);
		humanArray[2] = new Human(3, "Sammer", 4, 67);
		humanArray[3] = new Human(4, "Sunny", 6, 70);
		humanArray[4] = new Human(5, "Senthil", 5, 45);
		printManyHuman(humanArray);

	}
}
