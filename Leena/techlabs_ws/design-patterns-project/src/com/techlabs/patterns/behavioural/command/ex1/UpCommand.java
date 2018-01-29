package com.techlabs.patterns.behavioural.command.ex1;

public class UpCommand implements ICommand{

	
	public void execute(Car car){
		car.start();
	}
}
