package com.techlabs.isp.violation.test;

import com.techlabs.isp.violation.IWorkable;
import com.techlabs.isp.violation.Manager;
import com.techlabs.isp.violation.Programmer;
import com.techlabs.isp.violation.Robot;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager();
		atTheCateen(manager);
		Programmer programmer = new Programmer();
		atTheCateen(programmer);
		Robot robot = new Robot();
		atTheCateen(robot);
	}

	private static void atTheCateen(IWorkable x) {
		System.out.println("At the Cateen");
		x.eat();
	}

}
