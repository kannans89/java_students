package com.techlabs.player.test;

import com.techlabs.player.Player;

public class PlayerTest {

	public static void main(String[] argStrings) {

		Player p1 = new Player(10, "Sachin", 43);
		Player p2 = new Player(30, "Virat", 26);
		
		printPlayerDetails(p1);
		printPlayerDetails(p2);

		System.out.println("Eldest PLayer is:");
		printPlayerDetails(p2.getElderPlayer(p1));

	}

	private static void printPlayerDetails(Player player) {
		System.out.println("Name : " + player.getName() + " Age :"
				+ player.getAge() + " id :" + player.getId());
		System.out.println("HashCode :" + System.identityHashCode(player));
	}

}
