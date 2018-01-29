package com.techlabs.principles.isp.solution1;

public class Manager implements IWorker{
	
	@Override
	public void eat(){
		System.out.println("Manager is Eating");
	}
	
	@Override
	public void work(){
		System.out.println("Manager is Working");
	}

}
