package com.techlabs.patterns.creational.singleton.ex1;

public class Manager {
	
	private static Manager temp;
	
	private Manager(){
		System.out.println("Manager created");
	}
	
	public static Manager getManager(){
		if(temp == null){
			temp = new Manager();
		}
		return temp;
	}
	
	public void doWork(){
		System.out.println("manager is doing work...!");
	}
}
