package com.techlabs.dogdoor.test;

import com.techlabs.dogdoor.BackRecognizer;
import com.techlabs.dogdoor.DogDoor;
import com.techlabs.dogdoor.Remote;

public class DogDoorSimulator {

	public static void main(String[] args) {
		
		DogDoor door=new DogDoor();
		Remote remote=new Remote(door);
		BackRecognizer recognizer=new BackRecognizer(door);
		recognizer.recognize("Bhaoo-Bhaoo");
		
		
		/*//System.out.println(" Fido barks to go outside..");
		System.out.println();
		remote.pressButton();
		System.out.println("\n Fido has gone outside...");
		//remote.pressButton();
		System.out.println("\n Fido's all done...");
		try{
			Thread.currentThread().sleep(1000);
		}catch(InterruptedException ex){}
		
		System.out.println("...but he stucks outside!!!");
		System.out.println("\n Fido starts barking..");
		System.out.println("...so Gina grabs the remote control");
		remote.pressButton();
		System.out.println("\n Fido's back inside");
		//remote.pressButton();
*/	}

}
