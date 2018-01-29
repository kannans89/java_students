package com.techlab.player;

public class TestEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Player p1=new Player(1,22,"Vaibhavi");
		Player p2=new Player(1,22,"Vaibhavi");
		if(p1.equals(p2))
		{
			System.out.println("Same object");
		}
		else
		{
			System.out.println("Not same");
		}
	}

}
