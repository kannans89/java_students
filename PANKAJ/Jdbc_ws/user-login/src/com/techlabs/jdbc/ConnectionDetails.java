package com.techlabs.jdbc;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class ConnectionDetails {
	private static final String BUNDLE_NAME = "com.techlabs.jdbc.connectiondetails"; 

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
			.getBundle(BUNDLE_NAME);

	private ConnectionDetails() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
