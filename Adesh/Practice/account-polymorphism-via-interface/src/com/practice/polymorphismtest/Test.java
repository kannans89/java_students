package com.practice.polymorphismtest;

import com.practice.polymorphism.Boy;
import com.practice.polymorphism.IEmotionable;
import com.practice.polymorphism.IMannerable;
import com.practice.polymorphism.Man;

public class Test {
	public static void main(String args[]) {
		IMannerable[] object1 = new IMannerable[2];
		object1[0] = new Man();
		object1[1] = new Boy();
		atParty(object1);

		manTest();
		boyTest();

	}

	private static void atParty(IMannerable[] object1) {
		for (IMannerable man : object1) {
			man.depart();
			man.wish();
		}

	}

	private static void boyTest() {
		Boy boy = new Boy();
		System.out.println("======Inside Boy test=======");
		atPartyHall(boy);
		atMovieHall(boy);
	}

	private static void manTest() {
		Man man = new Man();
		System.out.println("=======Inside Man test=======");
		atPartyHall(man);
	}

	private static void atMovieHall(IEmotionable obj) {
		obj.cry();
		obj.laugh();
	}

	private static void atPartyHall(IMannerable obj) {
		obj.depart();
		obj.wish();
	}

}
