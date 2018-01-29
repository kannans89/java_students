package com.techlabs.patterns.behavioral.command.ex1;

public class UpCommand implements ICommand {
	//ivar
	private Car car;
	 public UpCommand(Car car) {
		this.car = car;
	}
	@Override
	public void execute() {
		car.start();		
	}

}
