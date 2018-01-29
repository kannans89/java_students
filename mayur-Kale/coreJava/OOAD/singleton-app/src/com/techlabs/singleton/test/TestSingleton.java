package com.techlabs.singleton.test;

import com.techlabs.singleton.SingletonClass;

public class TestSingleton {

	public static void main(String[] args) {
		SingletonClass class1 = SingletonClass.createInstance();
		SingletonClass class2 = SingletonClass.createInstance();
		if (class1 == class2)
			System.out.println("True");
		else
			System.out.println("False");
	}

}
