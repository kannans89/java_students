package com.techlabs.player;

public class Player {
	public  Player(int playerId, String playerName,int playerAge){
		this.playerId = playerId;
		this.playerName = playerName;
		this.playerAge = playerAge;
	}
	//Methods
	public int getId(){
		return playerId;
	}
	public String getName(){
		return playerName;
	}
	public int getAge(){
		return playerAge;
	}
	public Player findElderPlayer(Player that){
		if(this.getAge()> that.getAge()){
			return this;
		}else{
			return that;
		}
	}
	@Override
	public String toString(){
		String str = new String("Player Name :" +playerName+ ",Age: "+playerAge+",ID:"+playerId);
		return str + super.toString();
		
	}
	
	//Instance Variables
	private int playerId;
	private String playerName;
	private int playerAge;
}
