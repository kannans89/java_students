package com.techlabs.isp.solution1;

public class Programmer implements IWorker {

	@Override
	public void eat() {
		System.out.println(this.getClass()+ " is eating");
	}

	@Override
	public void work() {
		System.out.println(this.getClass()+" is working");
	}

}
