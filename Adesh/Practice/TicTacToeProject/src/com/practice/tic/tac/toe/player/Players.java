package com.practice.tic.tac.toe.player;

public class Players {
	private String name;
	private char mark;
	
	public Players(String name, char mark){
		this.name = name;
		this.mark = mark;
	}
	
	public String getName(){
		return name;
	}
	
	public char getMark(){
		return mark;
	}
}
