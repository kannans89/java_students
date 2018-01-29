package com.techlabs.patterns.behavioral.command;

public class DownCommand implements ICommand {
	Car car;
	 public DownCommand(Car car) {
		this.car=car;
	}


	@Override
	public void execute() {
		car.decelerate();
		System.out.println(car.getSpeed());
	}

}
