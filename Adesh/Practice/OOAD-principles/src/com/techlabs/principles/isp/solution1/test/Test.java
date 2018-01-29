package com.techlabs.principles.isp.solution1.test;

import com.techlabs.principles.isp.solution1.IWorker;
import com.techlabs.principles.isp.solution1.Manager;
import com.techlabs.principles.isp.solution1.Programmer;
import com.techlabs.principles.isp.solution1.Robot;

public class Test {

	public static void main(String[] args) {
		atCafetaria(new Manager());
		atWorkStation(new Manager());
		
		atCafetaria(new Programmer());
		atWorkStation(new Programmer());
		
		atWorkStation(new Robot());
		atCafetaria(new Robot());
	}

	private static void atCafetaria(IWorker worker) {
		System.out.println("In the Cafetaria====>");
		worker.eat();
	}

	private static void atWorkStation(IWorker worker) {
		System.out.println("In the WorkStation====>");
		worker.work();
	}

}
