package com.techlabs.patterns.behavioural.command;

import java.util.HashMap;
import java.util.Map;

public class Invoker {
	
	Car car=new Car(80);
	Map<String,ICommand> commands=new HashMap<String,ICommand>();
	
	public Invoker()
	{
		commands.put("up", new UpCommand(car));
		commands.put("down", new DownCommand(car));
		commands.put("right", new RightCommand(car));
		commands.put("left", new LeftCommand(car));
		
	}
	
	public void invoke(String key)
	{
		commands.get(key).execute();
	}

}
