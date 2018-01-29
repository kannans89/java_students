package dogDoorTest;

import dogDoor.BarkRecongnizer;
import dogDoor.DogDoor;

public class DogDoorSimulator {

	public static void main(String[] args) {
		DogDoor door = new DogDoor();
		BarkRecongnizer recongnizer = new BarkRecongnizer(door);
		//remote.pressButton();
		System.out.println("Fido barks to go outside.");
		recongnizer.recongnizer("Woof");
		System.out.println("Fido has gone outside");
		System.out.println("Fido has all done.");
		System.out.println("but he stuck outside");
		System.out.println("Fido starts barking");
		recongnizer.recongnizer("Woof");
		// System.out.println("so gina grab the rempte control");
		// remote.pressButton();
		System.out.println("Fido is back inside");
	}

}
