package com.techlabs.isp.solution2.test;

import com.techlabs.isp.solution2.IFeedable;
import com.techlabs.isp.solution2.IWorkable;
import com.techlabs.isp.solution2.Manager;
import com.techlabs.isp.solution2.Programmer;
import com.techlabs.isp.solution2.Robot;

public class Test {

	public static void main(String[] args) {

		IWorkable worker=new Programmer();
		worker.work();
		worker=new Manager();
		worker.work();
		worker=new Robot();
		worker.work();
		
		IFeedable human=new Programmer();
		human.eat();
		human=new Manager();
		human.eat();
		
	}

}
