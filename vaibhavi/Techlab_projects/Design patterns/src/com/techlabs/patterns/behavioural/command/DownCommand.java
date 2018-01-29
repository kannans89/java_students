package com.techlabs.patterns.behavioural.command;

public class DownCommand implements ICommand {
	
	private Car car;
	   public DownCommand(Car car) 
	   {
		   this.car=car;
		}

	@Override
	public void execute() {
 
		car.stop();
	}

}
