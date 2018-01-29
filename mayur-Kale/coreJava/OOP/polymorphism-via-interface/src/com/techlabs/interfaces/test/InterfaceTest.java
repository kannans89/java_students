package com.techlabs.interfaces.test;

import com.techlabs.interfaces.Boy;
import com.techlabs.interfaces.IEmotionable;
import com.techlabs.interfaces.IMannerable;
import com.techlabs.interfaces.Man;

public class InterfaceTest {

	public static void main(String[] args) {
		
		Man man = new Man();
		
		Boy boy = new Boy();
		
		atTheMovies(boy);
		
		atTheParty(man);
		
		atTheMovies(boy);
		
	}

	private static void atTheMovies(IEmotionable obj) {
		obj.cry();
		obj.laughs();
	}

	private static void atTheParty(IMannerable obj) {
		obj.depart();
		obj.wish();
	}

}
