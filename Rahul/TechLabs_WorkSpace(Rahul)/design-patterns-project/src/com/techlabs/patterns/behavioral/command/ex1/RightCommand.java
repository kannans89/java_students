package com.techlabs.patterns.behavioral.command.ex1;

public class RightCommand implements ICommand {
	private Car car;

	public RightCommand(Car car) {
		this.car = car;
	}

	@Override
	public void execute() {
		car.accelerate();
	}

}
