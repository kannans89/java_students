package com.techlabs.isp.solution1;


public class Robot implements IWorker {

	@Override
	public void eat() {
		throw new UnsupportedOperationException("Not Supported");
	}

	@Override
	public void work() {
		System.out.println(this.getClass()+" is working");
	}

}
