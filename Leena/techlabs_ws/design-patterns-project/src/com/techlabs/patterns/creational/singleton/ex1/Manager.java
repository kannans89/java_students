package com.techlabs.patterns.creational.singleton.ex1;

public class Manager {
	
	private static Manager uniquemanager=null;
	
	private Manager(){
		System.out.println("Manager is created");
	}
	
	public static Manager getmanager(){
		if(uniquemanager==null){
			uniquemanager=new Manager();
		}
		return uniquemanager;
	}

	public void doWork(){
		System.out.println(" Manager do your work....");
	}
}
