package com.techlabs.patterns.behavioral.command;

public class StopCommand implements ICommand {
	Car car;
	 public StopCommand(Car car) {
		this.car=car;
	}


	@Override
	public void execute() {
		car.stop();
		System.out.println(car.getSpeed());
	}

}
