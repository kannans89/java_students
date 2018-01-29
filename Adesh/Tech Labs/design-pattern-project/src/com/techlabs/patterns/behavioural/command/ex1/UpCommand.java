package com.techlabs.patterns.behavioural.command.ex1;

class UpCommand implements ICommand{
	
	public void execute(Car car) {
		car.start();
	}

}
