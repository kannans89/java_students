package com.techlabs.principles.isp.solution1;

public class Robot implements IWorker {

	public void eat() {
		throw new UnsupportedOperationException("unsupported operation");
	}

	public void work() {
		System.out.println("Robot is working");
	}
}
