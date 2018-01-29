package com.techlabs.man.test;

import com.techlabs.man.Boy;
import com.techlabs.man.Child;
import com.techlabs.man.Kid;
import com.techlabs.man.Man;

public class ManTest {

	public static void main(String[] args) {

		manTest();

		boyTest();
		
		manBoyTest();
		
		polymorphismTest();
	}

	private static void polymorphismTest() {
		atTheGround(new Man());
		
		atTheGround(new Boy());
		
		atTheGround(new Kid());
		
		atTheGround(new Child());
	}

	private static void manBoyTest() {
		Man x;
		x = new Boy();
		
		x.read();
		x.wish();
		x.play();
	}

	private static void boyTest() {
		Boy boy = new Boy();
		
		boy.read();
		boy.wish();
		boy.eat();
		boy.walk();
		boy.play();
	}

	private static void manTest() {
		Man man = new Man();
		
		man.read();
		man.wish();
		man.play();
	}

	private static void atTheGround(Man x) {
		System.out.println("At the Ground");
		x.play();
	}
}
