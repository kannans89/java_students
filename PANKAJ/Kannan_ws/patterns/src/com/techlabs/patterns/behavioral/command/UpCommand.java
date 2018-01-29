package com.techlabs.patterns.behavioral.command;

public class UpCommand implements ICommand {
	Car car;
	 public UpCommand(Car car) {
		this.car=car;
	}


	@Override
	public void execute() {
		car.accelerate();
		System.out.println(car.getSpeed());
	}

}
