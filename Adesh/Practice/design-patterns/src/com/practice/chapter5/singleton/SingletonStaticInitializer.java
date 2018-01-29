package com.practice.chapter5.singleton;

public class SingletonStaticInitializer {
	private static SingletonStaticInitializer uniqueInstance = new SingletonStaticInitializer();
	
	private SingletonStaticInitializer(){}
	
	public static SingletonStaticInitializer getInstance(){
		return uniqueInstance;
	}
	
}
