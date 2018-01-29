package com.techlabs.principles.isp.solution2.test;

import com.techlabs.principles.isp.solution2.IFeedable;
import com.techlabs.principles.isp.solution2.IWorkable;
import com.techlabs.principles.isp.solution2.Manager;
import com.techlabs.principles.isp.solution2.Programmer;
import com.techlabs.principles.isp.solution2.Robot;

public class Test {

	public static void main(String[] args) {
		
		atCafetArea(new Manager());
		atWorkStation(new Manager());
		atCafetArea(new Programmer());
		atWorkStation(new Programmer());
		atWorkStation(new Robot());
	}
	
	public static void atCafetArea(IFeedable worker){
		System.out.println("At CafetArea");
		worker.eat();
	}
	
	public static void atWorkStation(IWorkable worker){
		System.out.println("At WorkStation");
		worker.work();
		System.out.println("-------------------------");
	}
}
