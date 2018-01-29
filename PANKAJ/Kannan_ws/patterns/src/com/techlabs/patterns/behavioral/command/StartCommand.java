package com.techlabs.patterns.behavioral.command;

public class StartCommand implements ICommand {
	Car car;
	 public StartCommand(Car car) {
		this.car=car;
	}

	@Override
	public void execute() {
		car.start();
		System.out.println(car.getSpeed());
	}

}
