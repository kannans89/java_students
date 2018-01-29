package com.techlabs.dip.refactored.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.techlabs.dip.refactored.ILogger;
import com.techlabs.dip.refactored.TaxCalculator;

public class TestMain {

	public static void main(String[] args) throws InstantiationException,
			IllegalAccessException {
		String value = null;
		Class<?> class1 = null;
		try {
			InputStream inputStream = new FileInputStream("class.config");
			Properties properties = new Properties();
			properties.load(inputStream);
			value = properties.getProperty("class");

			inputStream.close();

		} catch (IOException exception) {

		}
		System.out.println(value);
		try {
			class1 = Class.forName(value);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		TaxCalculator calculator = new TaxCalculator(
				(ILogger) class1.newInstance());
		calculator.calculate(0, 0);
	}

}
