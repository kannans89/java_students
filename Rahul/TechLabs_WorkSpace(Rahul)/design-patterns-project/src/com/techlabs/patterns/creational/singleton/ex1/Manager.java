package com.techlabs.patterns.creational.singleton.ex1;

public class Manager {
	//clss variable
	private static Manager temp;
	
	//constructor
	private Manager(){
		System.out.println("Manager Created");
	}
	
	//static method
	public static Manager getManager(){
		if(temp == null){
			temp = new Manager();
		}
		return temp;
	}
	
	//Method
	public void doWork(){
		System.out.println("Doing work");
	}

}
