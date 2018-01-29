package com.practice.chapter2;

import com.practice.chapter4.DogDoor2;

public class Remote {
	private DogDoor door;

	public Remote(DogDoor door) {
		this.door = door;
	}

	public void pressButton() {
		System.out.println("Pressing the remote control Button...");
		if (door.isOpen()) {
			door.close();
		} else {
			door.open();
		}
	}

}
