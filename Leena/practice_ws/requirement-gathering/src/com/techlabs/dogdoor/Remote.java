package com.techlabs.dogdoor;

import java.util.Timer;
import java.util.TimerTask;

public class Remote {

	private DogDoor door;

	public Remote(DogDoor door) {
		this.door = door;
	}

	public void pressButton() {
		System.out.println("Pressing the remote control Button....");
		if (door.isOpen()) {
			door.close();
		} else {
			door.open();
			final Timer timer = new Timer();
			timer.schedule(new TimerTask() {
				public void run() {
					//System.out.println("running timer");
					door.close();
					timer.cancel();
				}
			}, 5000);
		}
	}
}
