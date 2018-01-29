package com.techlabs.patterns.behavioural.command.ex1;

class DownCommand implements ICommand{

	public void execute(Car car) {
		car.discelerate();
	}
	
	
}
