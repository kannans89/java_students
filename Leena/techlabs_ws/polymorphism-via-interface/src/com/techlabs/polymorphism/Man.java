package com.techlabs.polymorphism;

public class Man implements IMannerable{
	
	@Override
	public void wish(){
		System.out.println("Man is wishing");
	}
	
	@Override
	public void depart(){
		System.out.println("Man says Bye-Bye....");
	}
	
	public void play(){
		System.out.println("Man is Playing...");
	}

}
