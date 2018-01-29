package com.techlabs.principles.isp.solution2;

public class Programmer2 implements IFeedable, IWorkable{

	public void eat() {
		System.out.println("Programmer is eating");
	}

	public void work() {
		System.out.println("Programmer is working");
	}

}
