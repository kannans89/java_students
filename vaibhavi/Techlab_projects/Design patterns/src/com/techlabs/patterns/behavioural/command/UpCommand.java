package com.techlabs.patterns.behavioural.command;

public class UpCommand implements ICommand {

	private Car car;
   public UpCommand(Car car) 
   {
	   this.car=car;
	}
	@Override
	public void execute() {
		
		car.start();
	}

}