package com.techlabs.HollyAndBrucesDogdoor;

public class ScratchTest {

	public static void main(String[] args) {
		HollyAndBrucesDogDoor door=new HollyAndBrucesDogDoor();
		Scratch_Recognizer scratch=new Scratch_Recognizer(door);
		System.out.println("Brue Scratches at the door");
		scratch.recognize();
		System.out.println("Bruce goes outside");
		scratch.closeDoorAutomatically();
		System.out.println("Bruce does his business");
		System.out.println("Bruce again Scratches the door");
		scratch.recognize();
		System.out.println("Bruce comes back inside");
		scratch.closeDoorAutomatically();
	}

}
