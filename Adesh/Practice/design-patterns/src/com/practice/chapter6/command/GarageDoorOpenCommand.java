package com.practice.chapter6.command;

public class GarageDoorOpenCommand implements Command{

	GarageDoor garageDoor;
	
	public GarageDoorOpenCommand(GarageDoor garageDoor){
		this.garageDoor = garageDoor;
	}
	
	public void execute() {
		garageDoor.up();
	}
	
}
