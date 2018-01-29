package com.techlabs.player.test;

import com.techlabs.player.Player;

public class Test {

	public static void main(String[] args) {
		Player playerObj1 = new Player(1, 40, "Sachin");
		Player playerObj2 = new Player(1, 40, "Sachin");

		Player elderPlayer;
		elderPlayer = playerObj1.getElderPlayer(playerObj2);

		System.out.println(elderPlayer);

		System.out.println(elderPlayer.hashCode());
		System.out.println(playerObj1.hashCode());
		System.out.println(playerObj2.hashCode());

		System.out.println("Players are equal: "
				+ playerObj1.equals(playerObj2));
	}

}
