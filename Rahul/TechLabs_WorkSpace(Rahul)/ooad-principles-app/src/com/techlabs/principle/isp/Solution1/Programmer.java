package com.techlabs.principle.isp.Solution1;

public class Programmer implements IWorker {

	@Override
	public void eat() {
		System.out.println("Programmer having Food");
		
	}

	@Override
	public void work() {
		System.out.println("Programmer developing a Software");
		
	}

}
