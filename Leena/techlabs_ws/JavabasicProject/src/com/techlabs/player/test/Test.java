package com.techlabs.player.test;

import com.techlabs.player.Player;

public class Test {

	public static void main(String[] args) {
		
	Player playerObject1 = new Player(01,"Sachin",40);
	printPlayers(playerObject1);
	Player playerObject2= new Player(02,"Virat",41);
	printPlayers(playerObject2);
	Player elder=playerObject1.findElder(playerObject2);
	System.out.println("Details of Elder Player :");
	printPlayers(elder);
	
	//Hash code represents only two objects r created.....
	System.out.println(playerObject1);
	System.out.println(playerObject2.toString());
	System.out.println(elder.toString());
	}
	
	public static void printPlayers(Player player){
		System.out.println("ID of player :"+player.getId());
		System.out.println("Name of player :"+player.getName());
		System.out.println("Age of the player :"+player.getAge());
	}
	
	
	
}
