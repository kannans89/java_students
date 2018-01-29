package com.techlibs.human;

public class Test {

	public static void main(String[] args) {

		testHuman();
		testAnonymousHuman();
		Human[] humanArray = new Human[2];

		humanArray[0] = new Human(1, "s", 4, 67);
		humanArray[1] = new Human(3, "rt", 7, 80);

		printArray(humanArray);
	}

	private static void printArray(Human[] humanArray) {
		for (Human x : humanArray) {
			printHuman(x);
		}
	}

	private static void testAnonymousHuman() {
		System.out.println("Printing by anonymous object=");
		System.out.println(new Human(2, "abc", 2, 56).getName());
	}

	private static void testHuman() {
		Human humanObj1 = new Human(1, "adesh", 6, 60);
		Human humanObj2 = new Human(2, "kannan", 6, 62);

		printHuman(humanObj1);
		printHuman(humanObj2);
		changeHuman(humanObj1);
		printHuman(humanObj1);
	}

	private static void printHuman(Human human) {
		System.out.println("Human id= " + human.getId());
		System.out.println("Human name= " + human.getName());
		System.out.println("Human height= " + human.getHeight());
		System.out.println("Human weight= " + human.getWeight());
	}

	private static void changeHuman(Human newHuman) {
		newHuman.play();
	}
}
