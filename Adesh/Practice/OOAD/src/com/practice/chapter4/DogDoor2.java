package com.practice.chapter4;

import java.util.Timer;
import java.util.TimerTask;

public class DogDoor2 {

	private boolean open;
	private Bark allowedBarks;

	public DogDoor2() {
		this.open = false;
	}
	
	public void addAllowedBarks(Bark bark){
		this.allowedBarks = bark;
	}
	
	public Bark getAllowedBarks(){
		return allowedBarks;
	}
	

	public void open() {
		System.out.println("The Dog Door opens.");
		open = true;

		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				close();
				timer.cancel();
			}
		}, 5000);
	}

	public void close() {
		System.out.println("The Dog Door close.");
		open = false;
	}

	public boolean isOpen() {
		return open;
	}

}
