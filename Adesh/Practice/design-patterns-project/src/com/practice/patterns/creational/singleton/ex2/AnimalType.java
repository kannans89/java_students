package com.practice.patterns.creational.singleton.ex2;

public enum AnimalType {
	
	LION(true), TIGER(true), CAT(true), DOG(false), PARROT(false), SPARROW(false);
	
	public boolean isCarnivorous = false;
	
	private AnimalType(boolean type){
		isCarnivorous = type;
	}
	
	public boolean isCarnivorous(){
		return isCarnivorous;
	}
}
