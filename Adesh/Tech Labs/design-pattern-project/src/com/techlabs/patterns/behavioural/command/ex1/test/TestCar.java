package com.techlabs.patterns.behavioural.command.ex1.test;

import com.techlabs.patterns.behavioural.command.ex1.CommandInvoker;
import com.techlabs.patterns.behavioural.command.ex1.KeyType;

public class TestCar {

	public static void main(String[] args) {
		CommandInvoker invoker = new CommandInvoker();
		invoker.invoke(KeyType.UP);
		invoker.invoke(KeyType.RIGHT);
		invoker.invoke(KeyType.RIGHT);
		invoker.invoke(KeyType.DOWN);
		invoker.invoke(KeyType.LEFT);
	}

}
