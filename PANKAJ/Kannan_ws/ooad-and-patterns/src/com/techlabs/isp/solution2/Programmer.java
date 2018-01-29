package com.techlabs.isp.solution2;

public class Programmer implements IWorkable, IFeedable {

	@Override
	public void eat() {
		System.out.println("Programmer is eating");
	}

	@Override
	public void work() {
		System.out.println("Programmer is working");
	}

}
