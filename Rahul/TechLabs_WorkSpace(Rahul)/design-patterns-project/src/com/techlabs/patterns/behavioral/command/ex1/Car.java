package com.techlabs.patterns.behavioral.command.ex1;

public class Car {
	//Ivars
	private int speed;
	
	//methods
	public void start(){
		System.out.println("Car Started");
	}

	public void stop(){
		System.out.println("Car Stopped");
	}
	
	public void accelerate(){
		speed = speed+2;
		System.out.println("Car accelerated by "+speed+".");
	}
	public void brake(){
		speed = speed - 2;
		System.out.println("Car speed reduced, current speed "+speed+".");
		if(speed<=0){
			stop();
		}
	}

	@Override
	public String toString() {
		return "Car [speed = " + speed + "]";
	}
	
}
