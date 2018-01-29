package com.techlabs.principle.isp.Solution2;

public class Programmer implements IWorkFeed{

	@Override
	public void eat() {
		System.out.println("Programmer Having Food");
	}

	@Override
	public void work() {
		System.out.println("Programmer Working");
	}

}
