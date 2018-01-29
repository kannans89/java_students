package com.practice.chapter9;

public class Dog {
	int pounds = 6;
	float floatability = 2.1f;
	String name = "Generic";
	long[] feathers = { 1, 2, 3, 4, 5, 6, 7 };
	boolean canFly = true;
	int maxSpeed = 25;

	public Dog() {
		System.out.println("type 1 dog");
	}

	public Dog(boolean fly) {
		canFly = fly;
		System.out.println("type 2 dog");
	}

	public Dog(String n, long[] f) {
		name = n;
		feathers = f;
		System.out.println("type 3 dog");
	}

	public Dog(int w, float f) {
		maxSpeed = w;
		floatability = f;
		System.out.println("type 4 dog");
	}

	public Dog(float density, int max) {
		floatability = density;
		pounds = max;
		System.out.println("type 5 dog");
	}

}
