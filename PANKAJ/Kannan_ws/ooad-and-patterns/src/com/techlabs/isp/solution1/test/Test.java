package com.techlabs.isp.solution1.test;

import com.techlabs.isp.solution1.IWorker;
import com.techlabs.isp.solution1.Manager;
import com.techlabs.isp.solution1.Programmer;
import com.techlabs.isp.solution1.Robot;

public class Test {

	public static void main(String[] args) {
		IWorker worker=new Programmer();
		worker.eat();
		worker.work();
		
		worker=new Manager();
		worker.eat();
		worker.work();
		
		worker=new Robot();
		worker.eat();
		worker.work();
	}

}
