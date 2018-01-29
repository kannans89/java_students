package com.techlabs.people.test;

import com.techlabs.people.Boy;
import com.techlabs.people.Man;

public class Test {

	public static void main(String[] args) {
		
		//testMan();
		//testBoy();
		testManBoy();
	}
	public static void testMan(){
		Man man=new Man();
		man.eat();
		man.read();
		man.play();
	}
	public static void testBoy(){
		Boy boy=new Boy();
		boy.wish();
		boy.play();
		boy.eat();
		boy.read();
		
	}
	public static void testManBoy(){
		Man x=new Boy();
		x.eat();
		x.read();
		x.play();
	}

}
