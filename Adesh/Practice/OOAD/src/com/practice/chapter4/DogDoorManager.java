package com.practice.chapter4;

import com.practice.chapter4.Remote2;

public class DogDoorManager {

	public static void main(String[] args) {
		DogDoor2 door = new DogDoor2();
		door.addAllowedBarks(new Bark("woof"));
		door.addAllowedBarks(new Bark("rowlf"));
		door.addAllowedBarks(new Bark("rawlf"));
		door.addAllowedBarks(new Bark("yip"));
		
		BarkRecognizer2 recognizer = new BarkRecognizer2(door);
		Remote2 remote = new Remote2(door);
		
		//simulating the hardware hearing a bark.
		System.out.println("Bruce starts barking..");
		recognizer.recognize(new Bark("yip"));
		
		System.out.println("Bruce has gone outside.");
		
		try{
			Thread.currentThread().sleep(10000);
		}catch(InterruptedException e){}
		
		System.out.println("\nBruces all done...\nBut hes stuck outside!");
		
		//simulating hardware hearing a bark(not bruce)
		Bark smallDog = new Bark("wergh");
		System.out.println("A small dog strats barking..");
		recognizer.recognize(smallDog);
		
		try{
			Thread.currentThread().sleep(5000);
		}catch(InterruptedException e){}
		
		//simulate the hardware hearing a bark again.
		System.out.println("Bruce starts barking.");
		recognizer.recognize(new Bark("woof"));
		
		System.out.println("\nBruce back inside");
				
				
	}

}
