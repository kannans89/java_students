package com.techlabs.setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingsFactory {

	public static Greetings getGreeting() {
		ApplicationContext app = new ClassPathXmlApplicationContext("bean1.xml");
		return app.getBean(Greetings.class);
	}
}
