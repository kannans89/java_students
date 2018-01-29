package com.techlabs.principles.isp.solution1;

public class Robot implements IWorker{
	
	@Override
	public void eat(){
		throw new UnsupportedOperationException("Robot can't Eat");
	}

	@Override
	public void work(){
		System.out.println("Robot is working");
	}
}
