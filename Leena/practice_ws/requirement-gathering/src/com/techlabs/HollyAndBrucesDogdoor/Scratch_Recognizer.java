package com.techlabs.HollyAndBrucesDogdoor;

import java.util.Timer;
import java.util.TimerTask;

public class Scratch_Recognizer {
	
	private HollyAndBrucesDogDoor door;

		public Scratch_Recognizer(HollyAndBrucesDogDoor door){
			this.door=door;
		}
		
		public void recognize(){
			System.out.println(" Scratch recognizer recognize scratches.. " );
			door.open();
		}
		
		public void closeDoorAutomatically() {
			if (door.isOpen()) {
				door.close();
			} else {
				door.open();
				final Timer timer = new Timer();
				timer.schedule(new TimerTask() {
					public void run() {
						door.close();
						timer.cancel();
					}
				}, 5000);
			}
		}

}
