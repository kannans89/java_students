package com.techlabs.setter.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app;
		app=new ClassPathXmlApplicationContext("bean.xml");
		Greetings obj=app.getBean("greetings", Greetings.class);
		System.out.println(obj.getMessage());

	}

}
