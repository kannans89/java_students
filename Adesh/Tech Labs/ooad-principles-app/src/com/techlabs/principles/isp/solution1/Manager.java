package com.techlabs.principles.isp.solution1;

public class Manager implements IWorker{

	public void eat() {
		System.out.println("Manager is eating");
	}

	public void work() {
		System.out.println("Manager is working");
	}

}
