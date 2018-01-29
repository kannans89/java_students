package com.techlabs.kristenAndbitslesDogDoor;


public class KristensKeypad {
	
private KristensAndBristlesDogDoor door;
	
	 public KristensKeypad(KristensAndBristlesDogDoor door) {
		this.door=door;
		}
		
	
	public void recognize(int code){
		System.out.println(" Kristen enters a code on keypad ");
		door.close();
		
	}
}
