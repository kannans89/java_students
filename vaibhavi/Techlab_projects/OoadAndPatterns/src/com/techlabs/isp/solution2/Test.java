package com.techlabs.isp.solution2;

public class Test {

	public static void main(String[] args) {
		IWorkable worker;
		worker = new Robot();
		worker.work();
		IFeedable feedable;
		feedable = new Programmer();
		feedable.eat();

	}

}
