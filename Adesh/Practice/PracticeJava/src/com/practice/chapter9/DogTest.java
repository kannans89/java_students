package com.practice.chapter9;

public class DogTest {
	public static void main(String args[]) {

		int weight = 7;
		float density = 2.3f;
		String name = "donald";
		long[] feathers = { 1, 2, 3, 4 };
		boolean canFly = true;
		int airSpeed = 20;

		Dog[] dog1 = new Dog[7];

		dog1[0] = new Dog();
		dog1[1] = new Dog(density, weight);
		dog1[2] = new Dog(name, feathers);
		dog1[3] = new Dog(canFly);
		dog1[4] = new Dog(3.3f, airSpeed);
		dog1[5] = new Dog(false);
		dog1[6] = new Dog(airSpeed, density);
	}

}
