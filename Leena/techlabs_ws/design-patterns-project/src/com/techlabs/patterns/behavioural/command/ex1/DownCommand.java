package com.techlabs.patterns.behavioural.command.ex1;

public class DownCommand implements ICommand{

	
	public void execute(Car car){
		car.stop();
	}
}
