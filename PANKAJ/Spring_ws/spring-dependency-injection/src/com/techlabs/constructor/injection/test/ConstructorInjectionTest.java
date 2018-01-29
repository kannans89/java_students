package com.techlabs.constructor.injection.test;

import com.techlabs.constructor.injection.Greetings;
import com.techlabs.constructor.injection.GreetingsFactory;

public class ConstructorInjectionTest {

	public static void main(String[] args) {

		Greetings greeting = GreetingsFactory.getGreeting();
		System.out.println(greeting.getMessege());
	}

}
