package com.techlabs.patterns.behavioural.command.ex1;

public class Car {
	
	private int speed;
		
	public int getSpeed(){
		return this.speed;
	}
	
	public void start(){
		this.speed=1;
		System.out.println("Your Car's starting Speed is: "+ this.getSpeed()+"km/hr");
	}

	public void stop(){
		this.speed=0;
		System.out.println("your Car is Stopped...having Speed "+this.getSpeed()+"km/hr");
	}
	
	public void accelerate(){
		this.speed=this.speed+5;
		System.out.println("your Car is Accelerated...Currently having Speed is about "+this.getSpeed()+"km/hr");
	}
	
	public void descelerate(){
		this.speed=this.speed-2;
		System.out.println("your Car is Descelerated...having Speed "+this.getSpeed()+"km/hr");
		
	}
	
}
