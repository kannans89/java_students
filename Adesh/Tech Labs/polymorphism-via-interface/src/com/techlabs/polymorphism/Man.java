package com.techlabs.polymorphism;

public class Man implements IMannerable{
	public void wish(){
		System.out.println("man is wishing");
	}
	
	public void depart(){
		System.out.println("bye bye");
	}
	
	public static void play(){
		System.out.println("man is playing");
	}

}
