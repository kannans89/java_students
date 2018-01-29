package com.techlabs.patterns.behavioural.command;

public class RightCommand implements ICommand{
	private Car car;
	   public RightCommand(Car car) 
	   {
		   this.car=car;
		}
	@Override
	public void execute() {

		car.deccelerate();
	}

}
