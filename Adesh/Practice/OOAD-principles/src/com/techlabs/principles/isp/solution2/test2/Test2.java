package com.techlabs.principles.isp.solution2.test2;

import com.techlabs.principles.isp.solution2.IFeedable;
import com.techlabs.principles.isp.solution2.IWorkable;
import com.techlabs.principles.isp.solution2.Manager2;
import com.techlabs.principles.isp.solution2.Programmer2;
import com.techlabs.principles.isp.solution2.Robot2;

public class Test2 {

	public static void main(String[] args) {
		
		atCafetaria(new Manager2());
		atWorkStation(new Manager2());
		
		atCafetaria(new Programmer2());
		atWorkStation(new Programmer2());
		
		atWorkStation(new Robot2());
		
	}

	private static void atWorkStation(IWorkable worker) {
		System.out.println("In the WorkStation====>");
		worker.work();
	}

	private static void atCafetaria(IFeedable feeder) {
		System.out.println("In the Cafetaria====>");
		feeder.eat();
	}

}
