package com.techlabs.principles.isp.solution1;

public class Programmer implements IWorker{
	
	@Override
	public void eat(){
		System.out.println("Programmer is Eating");
	}
	
	@Override
	public void work(){
		System.out.println("Programmer is Working");
	}
	
}
