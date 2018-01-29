package com.techlabs.patterns.behavioural.command;

public class Car {
	
	private int speed;
	int spd;
	
	public Car(int speed)
	{
		this.speed=speed;
		spd=speed;
	}
	public void start()
	{
		speed=spd;
		System.out.println("starting at " +speed +" speed");
		
	}
	public void stop()
	{
		speed=0;
		System.out.println("stopping at " +speed +" speed");
	}
	public void accelerate()
	{
		speed=speed+15;
		System.out.println("Accelerating speed " +speed);
		
	}
	public void deccelerate()
	{
		speed=speed-15;
		System.out.println("deccelerating speed " +speed);
		
	}

}
