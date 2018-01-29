package com.techlabs.singleton;

public class SingletonClass {

	private static SingletonClass obj;

	private SingletonClass() {

	}

	public static SingletonClass createInstance() {

		if (obj == null) {
			obj = new SingletonClass();
		}
		return obj;
	}

	@Override
	public String toString() {
		return "SingletonClass []";
	}

}
