package com.prctice.day2;

public class Wolf extends Animal {

	public static void main(String[] args) {
		
		Wolf w = new Wolf();
		w.food = "Meat";
		w.location = "Cities";
		w.hunger = "Meat";
		displayDetails(w);
		makeNoise("hehhehhehehehhehehe");
	}

	public static void displayDetails(Wolf v) {
		System.out.println("Wolf Eats :" + v.food);
		System.out.println("Wolf's Location :" + v.location);
		System.out.println("Wolf Hunger is :" + v.hunger);
	}

		
	}


