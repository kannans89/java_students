package com.techlabs.patterns.behavioural.command;

public class LeftCommand implements ICommand{
	private Car car;
	   public LeftCommand(Car car) 
	   {
		   this.car=car;
		}
	   
	@Override
	public void execute() {

		car.accelerate();
	}

}
