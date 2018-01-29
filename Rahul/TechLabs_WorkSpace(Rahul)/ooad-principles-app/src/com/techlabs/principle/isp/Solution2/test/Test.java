package com.techlabs.principle.isp.Solution2.test;

import com.techlabs.principle.isp.Solution2.IWorkFeed;
import com.techlabs.principle.isp.Solution2.Manager;
import com.techlabs.principle.isp.Solution2.Programmer;
import com.techlabs.principle.isp.Solution2.IFeedable;
import com.techlabs.principle.isp.Solution2.IWorkable;
import com.techlabs.principle.isp.Solution2.Robot;



public class Test {

	public static void main(String[] args) {
		Programmer programmer = new Programmer();
		Manager manager = new Manager();
		Robot robot = new Robot();
		atCafeteria(programmer);
		atCafeteria(manager);
		
		atWorkPlace(programmer);
		atWorkPlace(robot);
		atWorkPlace(manager);
		
		atWorkPlace(new Manager());
		
	}
	public static void atCafeteria(IFeedable currectWorker){
		
		currectWorker.eat();
		
	}
	public static void atWorkPlace(IWorkable currectWorker){
		currectWorker.work();
		
	}
	



	}
