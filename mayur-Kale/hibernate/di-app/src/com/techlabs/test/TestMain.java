package com.techlabs.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlabs.factorymethod.IAutoFactory;
import com.techlabs.factorymethod.IAutoMobile;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		System.out.println(context.getClass());
 		IAutoFactory factory = (IAutoFactory) context.getBean("factory");
		IAutoMobile autoMobile = factory.make();
		autoMobile.start();
		autoMobile.stop();

	}
}
