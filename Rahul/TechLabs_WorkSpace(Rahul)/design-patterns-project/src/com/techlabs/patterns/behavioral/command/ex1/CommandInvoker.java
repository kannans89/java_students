package com.techlabs.patterns.behavioral.command.ex1;

import java.util.HashMap;
import java.util.Map;

public class CommandInvoker {
	private Car car;
	private Map<String,ICommand> map = new HashMap<String, ICommand>();

	public CommandInvoker() {
		car = new Car();
		map.put(KeyType.UP.toString(), new UpCommand(car));
		map.put(KeyType.DOWN.toString(), new DownCommand(car));
		map.put(KeyType.RIGHT.toString(), new RightCommand(car));
		map.put(KeyType.LEFT.toString(), new LeftCommand(car));
	}
	public Car getCar(){
		return car;
	}

	public void setCommand(KeyType key) {
		map.get(key.toString()).execute();
	}
}
