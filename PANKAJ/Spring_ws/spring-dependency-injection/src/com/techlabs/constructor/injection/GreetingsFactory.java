package com.techlabs.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingsFactory {

	public static Greetings getGreeting() {
		ApplicationContext app = new ClassPathXmlApplicationContext("bean2.xml");
		return app.getBean(Greetings.class);
		
	}
}
