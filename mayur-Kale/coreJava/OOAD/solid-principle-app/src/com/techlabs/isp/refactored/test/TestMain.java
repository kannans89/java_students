package com.techlabs.isp.refactored.test;

import com.techlabs.isp.refactored.IEatable;
import com.techlabs.isp.refactored.IWorkable;
import com.techlabs.isp.refactored.Manager;
import com.techlabs.isp.refactored.Programmer;
import com.techlabs.isp.refactored.Robot;

public class TestMain {

	public static void main(String[] args) {

		Manager manager = new Manager();
		atTheCateen(manager);
		atTheWorkStation(manager);
	
		Programmer programmer = new Programmer();
		atTheCateen(programmer);
		atTheWorkStation(programmer);
		
		Robot robot = new Robot();
		// atTheCateen(robot);
		atTheWorkStation(robot);
	}

	private static void atTheWorkStation(IWorkable x) {
		System.out.println("At the WorkStation");
		x.work();

	}

	private static void atTheCateen(IEatable x) {
		System.out.println("At the Cateen");
		x.eat();

	}

}
