package com.practice.chapter5.singleton;

public class SingletonVolatile {
	private volatile static SingletonVolatile uniqueInstance;
	
	private SingletonVolatile(){}
	
	public static SingletonVolatile getInstance(){
		if(uniqueInstance == null){
			synchronized(SingletonVolatile.class){
				if(uniqueInstance == null){
					uniqueInstance = new SingletonVolatile();
				}
			}
		}
		return uniqueInstance;
	}
}
