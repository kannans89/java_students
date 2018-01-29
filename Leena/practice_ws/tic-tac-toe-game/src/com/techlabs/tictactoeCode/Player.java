package com.techlabs.tictactoeCode;


public class Player {
	private String playerName;
	private int playerNumber;

	public Player(String name,char playerSign){
		this.playerName=name;
		this.playerNumber=playerSign;
	}
	
	public String getPlayerName() {
		return playerName;
	}

	
	public int getPlayerSign() {
		return playerNumber;
	}
	

	
	
	

}
