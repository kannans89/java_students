package com.techlabs.patterns.behavioural.command.ex1;

public class RightCommand implements ICommand{
	
	
	public void execute(Car car){
		car.accelerate();
	}

}
