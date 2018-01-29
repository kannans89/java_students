package com.techlabs.patterns.behavioural.command.ex1;

public class Car {
	private int speed;
	
	/*public Car(int speed){
		this.speed = speed;
	}*/
	
	public void start(){
		this.speed = 1;
		System.out.println("Car Starts.. Speed = "+this.speed+"km/hr");
	}
	
	public void stop(){
		this.speed = 0;
		System.out.println("Car stops.. Speed = "+this.speed+"km/hr");
	}
	
	public void accelerate(){
		this.speed = this.speed + 5;
		System.out.println("Accelerating.. Speed = "+this.speed+"km/hr");
	}
	
	public void discelerate(){
		this.speed = this.speed - 2;
		System.out.println("discelerating.. Speed = "+this.speed+"km/hr");
	}
}
