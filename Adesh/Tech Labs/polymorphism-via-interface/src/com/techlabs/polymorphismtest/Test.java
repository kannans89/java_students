package com.techlabs.polymorphismtest;

import com.techlabs.polymorphism.Boy;
import com.techlabs.polymorphism.IEmotionable;
import com.techlabs.polymorphism.IMannerable;
import com.techlabs.polymorphism.Man;

public class Test {
	public static void main(String args[]) {

		IMannerable[] object1 = new IMannerable[2];
		object1[0] = new Man();
		object1[1] = new Boy();
		System.out.println("IMannerable Aray:===========:");
		partyHall(object1);

		IEmotionable[] object2 = new IEmotionable[1];
		object2[0] = new Boy();
		System.out.println("IEmotionable Array:=========:");
		movieHall(object2);

		manTest();
		boyTest();

	}

	private static void movieHall(IEmotionable[] object) {
		for (IEmotionable boy : object) {
			boy.cry();
			boy.laugh();
		}

	}

	private static void partyHall(IMannerable[] object) {
		for (IMannerable man : object) {
			man.depart();
			man.wish();
		}

	}

	private static void manTest() {
		Man man = new Man();
		atPartyHall(man);
		// atMovieHall(man);
	}

	public static void boyTest() {
		Boy boy = new Boy();
		atMovieHall(boy);
		atPartyHall(boy);
	}

	public static void atPartyHall(IMannerable obj) {

		System.out.println("we are inside the partyHall");
		obj.wish();
		obj.depart();
	}

	public static void atMovieHall(IEmotionable obj) {
		System.out.println("we are inside the movieHall");
		obj.cry();
		obj.laugh();
	}

}
