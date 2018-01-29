package com.techlabs.setter.injection.test;

import com.techlabs.setter.injection.Greetings;
import com.techlabs.setter.injection.GreetingsFactory;

public class SetterInjectionTest {

	public static void main(String[] args) {

		Greetings greeting=GreetingsFactory.getGreeting();
		System.out.println(greeting.getMessege());
	}

}
