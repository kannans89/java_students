package com.practice.chapter4;

import java.util.Iterator;
import java.util.List;

public class BarkRecognizer2 {

	private DogDoor2 door2;

	public BarkRecognizer2(DogDoor2 door2) {
		this.door2 = door2;
	}

	public void recognize(Bark bark) {
		System.out.println("  Barkrecognizer: heard a  '" + bark.getSound() + "'");
		/*List allowedBarks = door2.getAllowedBarks();
		for(Iterator i = allowedBarks.iterator(); i.hasNext();){
			Bark allowedBark = (Bark) i.next();
			if(allowedBark.equals(bark)){
				door2.open();
				return;
			}
		}*/
		System.out.println("This dog is not allowed.");
	}

}
