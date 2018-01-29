package com.techlabs.principles.isp.solution1.test;

import com.techlabs.principles.isp.solution1.IWorker;
import com.techlabs.principles.isp.solution1.Manager;
import com.techlabs.principles.isp.solution1.Programmer;
import com.techlabs.principles.isp.solution1.Robot;

public class Test {

	public static void main(String[] args) {
		atcafeteriat(new Manager());
		atcafeteriat(new Programmer());
		atcafeteriat(new Robot());
		
		atWorkStation(new Programmer());
		atWorkStation(new Manager());
		atWorkStation(new Robot());
		
	}
	
	public static void atcafeteriat(IWorker worker){
		System.out.println("At CafetArea");
		worker.eat();
		System.out.println("-------------------------------------------------");
	}
	
	public static void atWorkStation(IWorker worker){
		System.out.println("At WorkStation");
		worker.work();
		System.out.println("-------------------------------------------------");
	}
}
