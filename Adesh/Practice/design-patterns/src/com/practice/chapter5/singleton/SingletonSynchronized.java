package com.practice.chapter5.singleton;

public class SingletonSynchronized {

	private static SingletonSynchronized uniqueInstance;
	
	private SingletonSynchronized() {
	}
	
	public static synchronized SingletonSynchronized getInstance(){
		if(uniqueInstance == null){
			uniqueInstance = new SingletonSynchronized();
		}
		return uniqueInstance;
	}
	
}
