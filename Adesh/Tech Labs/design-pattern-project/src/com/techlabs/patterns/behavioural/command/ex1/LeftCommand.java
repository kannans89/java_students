package com.techlabs.patterns.behavioural.command.ex1;

class LeftCommand implements ICommand{

	public void execute(Car car) {
		car.stop();
	}

}
