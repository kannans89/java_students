package com.techlabs.principles.isp.solution2;

public class Manager implements IFeedable,IWorkable{

	@Override
	public void eat(){
		System.out.println("Manager is Eating");
	}
	
	@Override
	public void work(){
		System.out.println("Manager is Working");
	}

}
