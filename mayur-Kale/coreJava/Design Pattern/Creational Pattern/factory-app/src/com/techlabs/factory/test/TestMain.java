package com.techlabs.factory.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.techlabs.factory.IAutoFactory;
import com.techlabs.factory.IAutoMobile;

public class TestMain {

	public static void main(String[] args) {

		IAutoFactory factory = null;
		try {
			factory = getFactory();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}

		IAutoMobile auto = factory.make();
		auto.start();
		auto.stop();
	}

	public static IAutoFactory getFactory() throws InstantiationException,
			IllegalAccessException {
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

		return (IAutoFactory) class1.newInstance();
	}

}
