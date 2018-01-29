package com.techlabs.inheritance.test;

import com.techlabs.inheritance.Boy;

import com.techlabs.inheritance.Man;

public class Test {

	public static void main(String[] args) {
		/*
		 * System.out.println("Details of Man :"); 
		 * testMan();
		 * System.out.println(); System.out.println("Details of Boy :");
		 * testBoy(); System.out.println();
		 */
		System.out.println("Output Of TestBoy :");
		testManBoy();

	}

	public static void testMan() {

		Man man = new Man();
		man.read();
		man.play();
		man.wish();
	}

	public static void testBoy() {
		Boy boy = new Boy();
		boy.eat();
		boy.play();
		boy.read();
		boy.wish();
	}

	public static void testManBoy() {
		Man man;
		man = new Boy();

		man.play();
		man.read();
		man.wish();

	}
}
