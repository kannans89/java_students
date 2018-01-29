package com.prctice.day2;

public class Cat extends Animal {

	public static void main(String[] args) {

		Cat c = new Cat();
		c.food = "Vegetables";
		c.location = "Cities";
		c.hunger = "Meat";
		displayDetails(c);
		makeNoise("Me-yaav");
	}

	public static void displayDetails(Animal v) {
		System.out.println("Cat Eats :" + v.food);
		System.out.println("Cat's Location :" + v.location);
		System.out.println("Cat Hunger is :" + v.hunger);
	}

}