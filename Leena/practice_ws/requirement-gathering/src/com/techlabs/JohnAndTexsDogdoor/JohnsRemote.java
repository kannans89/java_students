package com.techlabs.JohnAndTexsDogdoor;

import java.util.Timer;
import java.util.TimerTask;

public class JohnsRemote {

	private JohnAndTexsDogdoor door;

	public JohnsRemote(JohnAndTexsDogdoor door) {
		this.door = door;
	}

	
	public void pressButton() {
		
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
