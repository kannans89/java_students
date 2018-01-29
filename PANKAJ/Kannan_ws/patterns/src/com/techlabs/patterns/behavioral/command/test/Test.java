package com.techlabs.patterns.behavioral.command.test;

import com.techlabs.patterns.behavioral.command.Invoker;

public class Test {

	public static void main(String[] args) {

		Invoker invoker=new Invoker();
		invoker.invoke("Start");
		invoker.invoke("Up");
		invoker.invoke("Down");
		invoker.invoke("Stop");
	}

}
