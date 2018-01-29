package com.techlabs.principles.isp.solution2;

public class Programmer implements IFeedable,IWorkable{

	@Override
	public void eat(){
		System.out.println("Programmer is Eating");
	}
	
	@Override
	public void work(){
		System.out.println("Programmer is Working");
	}
}
