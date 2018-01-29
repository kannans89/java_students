package com.techlabs.patterns.behavioural.command.ex1.test;

import com.techlabs.patterns.behavioural.command.ex1.CommandInvokr;
import com.techlabs.patterns.behavioural.command.ex1.KeyType;

public class Test {

	public static void main(String[] args) {
		
		CommandInvokr invoker=new CommandInvokr();
		invoker.invoke(KeyType.UP);
		invoker.invoke(KeyType.RIGHT);
		invoker.invoke(KeyType.RIGHT);
		invoker.invoke(KeyType.LEFT);
		invoker.invoke(KeyType.DOWN);
	}

}
