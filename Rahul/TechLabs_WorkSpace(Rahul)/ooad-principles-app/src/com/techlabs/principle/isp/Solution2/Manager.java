package com.techlabs.principle.isp.Solution2;

public class Manager implements IWorkFeed {

	@Override
	public void eat() {
		System.out.println("Manager Having Food");
	}

	@Override
	public void work() {
		System.out.println("Manager Working");
	}

}
