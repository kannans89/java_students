package com.practice.chapter3;

import com.practice.chapter2.DogDoor;

public class BarkRecognizer {
	private DogDoor door;

	public BarkRecognizer(DogDoor door) {
		this.door = door;
	}

	public void recognize(String bark) {
		System.out.println("  Barkrecognizer: heard a  '" + bark + "'");
		door.open();
	}
}
