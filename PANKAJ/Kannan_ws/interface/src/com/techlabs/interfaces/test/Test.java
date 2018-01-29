package com.techlabs.interfaces.test;

import com.techlabs.interfaces.Boy;
import com.techlabs.interfaces.IEmotions;
import com.techlabs.interfaces.IManners;
import com.techlabs.interfaces.Man;

public class Test {

	public static void main(String[] args) {
		testMan();
		testBoy();
	}

	static void testMan() {
		Man man = new Man();
		man.depart();
		man.wish();
		partyHall(man);
	}

	static void testBoy() {
		Boy boy = new Boy();
		boy.cry();
		boy.laugh();
		cinemaHall(boy);
		partyHall(boy);
	}

	static void cinemaHall(IEmotions obj) {
		obj.cry();
		obj.laugh();
	}

	static void partyHall(IManners obj) {
		obj.depart();
		obj.wish();
	}

}
