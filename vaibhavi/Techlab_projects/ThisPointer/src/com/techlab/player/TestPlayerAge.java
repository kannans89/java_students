package com.techlab.player;

public class TestPlayerAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player sachin=new Player(1,40,"Sachin");
		Player Kapil=new Player(2,55,"kapil");
		Player elderPlayer=sachin.getElderPlayer(Kapil);
		System.out.println(elderPlayer);
		System.out.println(sachin.hashCode());
		System.out.println(Kapil.hashCode());
		System.out.println(elderPlayer.hashCode());
		
	
	}

}
