package com.techlabs.patterns.behavioral.command.ex1;

public class Test {

	public static void main(String[] args) {
		CommandInvoker command = new CommandInvoker();
		command.setCommand(KeyType.UP);
		command.setCommand(KeyType.RIGHT);
		command.setCommand(KeyType.RIGHT);
		command.setCommand(KeyType.LEFT);
		command.setCommand(KeyType.DOWN);
		System.out.println("===========================");
		command.setCommand(KeyType.UP);
		command.setCommand(KeyType.LEFT);
	}	

}
