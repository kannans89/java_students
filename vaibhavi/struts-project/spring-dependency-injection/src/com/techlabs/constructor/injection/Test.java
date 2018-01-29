package com.techlabs.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlabs.setter.injection.Greetings;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext app;
		app=new ClassPathXmlApplicationContext("bean.xml");
		Greetings1 obj=app.getBean("greetings1", Greetings1.class);
		System.out.println(obj.getMessage());

	}

}
