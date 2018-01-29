package com.techlabs.inheritance;

public class Boy extends Man{
	
	public void eat(){
		System.out.println("Boy is Eating");
	}
	
	@Override
	public void play(){
		System.out.println("Play method of Boy Class");
	}

}
