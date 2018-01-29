package com.techlabs.patterns.behavioural.command.ex1;

public class LeftCommand implements ICommand{
	
	public void execute(Car car){
		car.descelerate();
	}

}
