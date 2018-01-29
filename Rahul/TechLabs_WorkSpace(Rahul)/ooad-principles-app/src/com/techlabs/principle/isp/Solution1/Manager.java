package com.techlabs.principle.isp.Solution1;

public class Manager implements IWorker{

	@Override
	public void eat() {
		System.out.println("Manager having Food");
		
	}

	@Override
	public void work() {
		System.out.println("Manager is Working");
	}
	

}
