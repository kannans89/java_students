package com.techlabs.patterns.behavioural.command.ex1;

class RightCommand implements ICommand{

	public void execute(Car car) {
		car.accelerate();
	}

}
