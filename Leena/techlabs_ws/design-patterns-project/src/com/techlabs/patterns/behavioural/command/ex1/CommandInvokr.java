package com.techlabs.patterns.behavioural.command.ex1;

import java.util.HashMap;

import java.util.Map;

public class CommandInvokr {
	
	private Car car;
	private Map<KeyType,ICommand> map=new HashMap<KeyType, ICommand>();
	
	public CommandInvokr(){
		car=new Car();
		map.put(KeyType.UP, new UpCommand());
		map.put(KeyType.DOWN, new DownCommand());
		map.put(KeyType.RIGHT, new RightCommand());
		map.put(KeyType.LEFT, new LeftCommand());
	}

	public void invoke(KeyType key){
		map.get(key).execute(car);
		
	}
}
