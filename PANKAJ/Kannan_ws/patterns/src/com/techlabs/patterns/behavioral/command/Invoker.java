package com.techlabs.patterns.behavioral.command;

import java.util.HashMap;
import java.util.Map;

public class Invoker {
	Car car=new Car();
	Map<String,ICommand> maps;
	
	public Invoker(){
		maps=new HashMap<String, ICommand>();
		maps.put("Start", new StartCommand(car));
		maps.put("Up", new UpCommand(car));
		maps.put("Down", new DownCommand(car));
		maps.put("Stop", new StopCommand(car));
	}
	
	public void invoke(String key){
		maps.get(key).execute();
	}
}
