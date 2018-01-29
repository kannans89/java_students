package com.techlabs.patterns.behavioral.command;

public class Car {

	private int speed;
	
	public void start(){
		speed=20;
	}
	
	public void stop(){
		speed=0;
	}
	
	public void accelerate(){
		speed+=15;
	}
	
	public void decelerate(){
		speed-=15;
	}
	
	public int getSpeed(){
		return speed;
	}
}
