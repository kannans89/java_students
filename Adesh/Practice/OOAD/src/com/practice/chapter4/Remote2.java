package com.practice.chapter4;

import com.practice.chapter4.DogDoor2;

public class Remote2 {
	private DogDoor2 door2;

	public Remote2(DogDoor2 door2) {
		this.door2 = door2;
	}

	public void pressButton() {
		System.out.println("Pressing the remote control Button...");
		if (door2.isOpen()) {
			door2.close();
		} else {
			door2.open();
		}
	}


}
