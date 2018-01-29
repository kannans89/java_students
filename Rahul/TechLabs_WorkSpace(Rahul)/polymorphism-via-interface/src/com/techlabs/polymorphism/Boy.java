package com.techlabs.polymorphism;

public class Boy implements IMannerable,IEmotional{
	public void wish(){
		System.out.println("Hello world, Good Morning");
	}

	public void depart(){
		System.out.println("Hey World Bye have a Good Day");
	}
	public void cry(){
		System.out.println("Im Criying");
	}

	public void laugh(){
		System.out.println("Haaahaaahaa haaahaaahaa");
	}
	public void eat(){
		System.out.println("Foody time");
	}

}
