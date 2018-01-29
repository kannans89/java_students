package com.techlabs.people;

public class Boy extends Man{
	public void wish(){
		System.out.println("Boy wishes you Hello");
	}
	@Override
	public void play(){
		System.out.println("Boy is playing football");
	}

}
