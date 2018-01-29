package com.techlabs.principle.isp.Solution1;

public class Robot implements IWorker {

	@Override
	public void eat() throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Error !! :I cannot Eat");	
	}

	@Override
	public void work() {
		System.out.println("Robot Working");
		
	}
	
}
