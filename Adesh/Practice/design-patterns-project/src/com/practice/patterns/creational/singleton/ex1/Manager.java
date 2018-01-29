package com.practice.patterns.creational.singleton.ex1;

public class Manager {
	private static Manager instance;
	
	private Manager(){
		System.out.println("Manager is created.\n");
	}
	
	public static Manager getManager(){
		if(instance == null){
			instance = new Manager();
		}
		return instance;
	}
	
	public void doWork(){
		System.out.println("Manager is doing work..!");
	}

}
