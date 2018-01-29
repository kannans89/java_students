package com.techlabs.isp.solution2;

public class Manager implements IWorkable, IFeedable {

	@Override
	public void eat() {
		System.out.println("Manager is eating");
	}

	@Override
	public void work() {
		System.out.println("Manager is working");
	}

}
