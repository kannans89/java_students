package com.techlabs.principles.isp.solution1.test;

import com.techlabs.principles.isp.solution1.IWorker;
import com.techlabs.principles.isp.solution1.Manager;
import com.techlabs.principles.isp.solution1.Programmer;
import com.techlabs.principles.isp.solution1.Robot;

public class Test {

	public static void main(String[] args) {

		atCafetaria(new Manager());
		atWorkstation(new Manager());
		atCafetaria(new Programmer());
		// throwing error for eat method.
		atCafetaria(new Robot());
	}

	private static void atWorkstation(IWorker worker) {
		System.out.println("In the Workstation========>");
		worker.work();
	}

	private static void atCafetaria(IWorker worker) {
		System.out.println("In the cafetaria=========>");
		worker.eat();
	}

}
