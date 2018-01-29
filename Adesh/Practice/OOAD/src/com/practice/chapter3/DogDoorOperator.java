package com.practice.chapter3;

import com.practice.chapter2.DogDoor;
import com.practice.chapter2.Remote;

public class DogDoorOperator {

	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		@SuppressWarnings("unused")
		Remote remote = new Remote(door);
		BarkRecognizer recognizer = new BarkRecognizer(door);

		System.out.println("Fido starts barking.");
		recognizer.recognize("Woof");
		System.out.println("\nFido has gone outside...");
		System.out.println("\nFido's all done...");
		try {
			Thread.currentThread();
			Thread.sleep(10000);
		} catch (InterruptedException ex) {
		}
		System.out.println("...But he's stuck outside.!");
		System.out.println("Fido starts barking...");
		recognizer.recognize("Woof");
		System.out.println("\nFido's back inside...");
	}

}
