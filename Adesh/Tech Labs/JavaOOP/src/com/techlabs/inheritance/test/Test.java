package com.techlabs.inheritance.test;

import com.techlabs.inheritance.Boy;
import com.techlabs.inheritance.Man;

public class Test {

	public static void main(String[] args) {
		testMan();
		testBoy();
		testManBoy();
	}

	private static void testManBoy() {
		Man man = new Boy();

		man.play();
		man.read();
		man.wish();
	}

	private static void testBoy() {
		Boy b = new Boy();

		b.eat();
		b.read();
	}

	private static void testMan() {
		Man m = new Man();

		m.read();
		m.play();
		m.wish();
	}

}
