package com.techlabs.inheritance.test;

import com.techlabs.inheritance.Boy;
import com.techlabs.inheritance.Man;

public class Test {
	public static void main(String args[]) {
		testMan();
		testBoy();
		testManBoy();
	}
	public static void testMan(){
		Man man = new Man();
		man.play();
		man.read();
		man.wish();
		System.out.println("------------------------------------");
	}
	public static void testBoy(){
		Boy boy = new Boy();
		boy.eat();
		boy.play();
		boy.read();
		boy.wish();
		System.out.println("-------------------------------------");
	}
	public static void testManBoy(){
		Man x = new Boy();
		x.play();
		x.read();
		x.wish();
	}

}
