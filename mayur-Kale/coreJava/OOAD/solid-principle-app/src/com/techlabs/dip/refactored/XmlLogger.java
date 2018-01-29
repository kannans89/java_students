package com.techlabs.dip.refactored;

public class XmlLogger implements ILogger {

	@Override
	public void log(String message) {
		System.out.println("Error was caught and store in Xml:" + message);
	}

}
