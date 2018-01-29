package com.techlabs.inheritance;

public class Boy extends Man {
	public void eat(){
		System.out.println("Let's have Food");
	}
	@Override
	public void play(){
		System.out.println("Im Playing Football");
	}

}
