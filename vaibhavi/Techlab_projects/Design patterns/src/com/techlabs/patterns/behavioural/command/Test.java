package com.techlabs.patterns.behavioural.command;

public class Test {

	public static void main(String[] args) {

		Invoker invoker=new Invoker();
		invoker.invoke("up");
		invoker.invoke("down");
		invoker.invoke("up");
		invoker.invoke("left");
		invoker.invoke("right");
	}

}
