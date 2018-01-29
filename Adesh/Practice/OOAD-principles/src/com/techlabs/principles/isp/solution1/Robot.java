package com.techlabs.principles.isp.solution1;

public class Robot implements IWorker{

    public void work() {
    	System.out.println("Robot is working");
	}
	
	public void eat() {
		throw new UnsupportedOperationException("unsupported operation");
	}
}
