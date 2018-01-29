package com.techlabs.isp.solution2;

public class Manager implements IFeedable,IWorkable{

	@Override
	public void work() {
		System.out.println("Manager is working");
	}

	@Override
	public void eat() {
		System.out.println("Manager is eating");
	}

}
