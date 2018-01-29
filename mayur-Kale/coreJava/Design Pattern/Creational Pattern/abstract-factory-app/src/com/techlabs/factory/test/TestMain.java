package com.techlabs.factory.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.techlabs.factory.IAutoMobile;
import com.techlabs.factory.IAutoMobileFactory;

public class TestMain {

	public static void main(String[] args) {

		IAutoMobileFactory factory = null;
		try {
			factory = getFactory();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		IAutoMobile auto = factory.makeHatchBack();
		auto.start();
		auto.stop();

		auto = factory.makeSedan();
		auto.start();
		auto.stop();

	}

	public static IAutoMobileFactory getFactory()
			throws InstantiationException, IllegalAccessException {
		String factoryName = null;
		Class<?> class1 = null;

		try {
			InputStream in = new FileInputStream("factory.property");
			Properties properties = new Properties();
			properties.load(in);
			factoryName = properties.getProperty("factory");
		} catch (IOException exception) {

		}

		try {
			class1 = Class.forName(factoryName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return (IAutoMobileFactory) class1.newInstance();
	}
}
