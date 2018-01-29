package com.techlabs.dogdoor;

public class BackRecognizer {
	private DogDoor door;
	
	public BackRecognizer(DogDoor door){
		this.door=door;
	}
	
	public void recognize(String bark){
		System.out.println(" BarkRecognizer : Heard a '"+bark+"'" );
		door.open();
	}

}
