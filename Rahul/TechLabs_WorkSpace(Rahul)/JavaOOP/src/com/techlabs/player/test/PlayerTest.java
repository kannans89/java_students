package com.techlabs.player.test;

import com.techlabs.player.Player;

public class PlayerTest {
	public static void main(String args[]) {
		Player player1 = new Player(1, "Sachin", 40);
		Player player2 = new Player(2, "Virat", 45);
		PrintPlayers(player1);
		PrintPlayers(player2);
		Player elderPlayer = player1.findElderPlayer(player2);//only storing the elder value object 
		System.out.println("The Elder Player is :-");
		System.out.println(elderPlayer);
		System.out.println(player1);
		System.out.println(player2);
		PrintPlayers(elderPlayer);
	}

	public static void PrintPlayers(Player player) {
		System.out.println("ID:- " + player.getId());
		System.out.println("Name:-" + player.getName());
		System.out.println("Age:-" + player.getAge());
		System.out.println("----------------------------------------");
	}

}
