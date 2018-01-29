package com.techlabs.patterns.behavioural.command.ex1;

import java.util.HashMap;

public class CommandInvoker {
	private Car car;
	private HashMap<KeyType, ICommand> map;
	
	public CommandInvoker(){
		car = new Car();
		map = new HashMap<KeyType, ICommand>();
		map.put(KeyType.UP, new UpCommand());
		map.put(KeyType.RIGHT, new RightCommand());
		map.put(KeyType.DOWN, new DownCommand());
		map.put(KeyType.LEFT, new LeftCommand());
	}
	
	public void invoke(KeyType type){
		 map.get(type).execute(car);
	}
}
