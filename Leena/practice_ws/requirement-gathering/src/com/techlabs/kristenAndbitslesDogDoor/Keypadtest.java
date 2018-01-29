package com.techlabs.kristenAndbitslesDogDoor;

import java.util.Scanner;

public class Keypadtest {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		KristensAndBristlesDogDoor door=new KristensAndBristlesDogDoor();
		KristensKeypad keypad=new KristensKeypad(door);
		door.open();
		System.out.println("Britsels wants to go out..");
		System.out.println("Hurry up..Kristens enter ur code...");
		int code=scr.nextInt();
		keypad.recognize(code);
	}

}
