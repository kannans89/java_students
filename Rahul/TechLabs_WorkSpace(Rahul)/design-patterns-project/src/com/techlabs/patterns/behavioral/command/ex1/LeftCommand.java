package com.techlabs.patterns.behavioral.command.ex1;

public class LeftCommand implements ICommand{
	private Car car;
	public LeftCommand(Car car) {
		this.car = car;
	}
	@Override
	public void execute() {
		car.brake();
	}

}
