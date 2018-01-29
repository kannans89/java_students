package com.techlabs.principles.isp.solution2.test2;

import com.techlabs.principles.isp.solution2.IFeedable;
import com.techlabs.principles.isp.solution2.IWorkable;
import com.techlabs.principles.isp.solution2.Manager2;
import com.techlabs.principles.isp.solution2.Programmer2;
import com.techlabs.principles.isp.solution2.Robot2;

public class Test2 {

	public static void main(String[] args) {
		atCafetaria(new Manager2());
		atWorkstation(new Manager2());

		atCafetaria(new Programmer2());
		atWorkstation(new Programmer2());

		atWorkstation(new Robot2());
		// robot is not implementing IFeedable
		// atCafetaria(new Robot2());

	}

	private static void atWorkstation(IWorkable worker) {
		System.out.println("In the Workstation========>");
		worker.work();
	}

	private static void atCafetaria(IFeedable feeder) {
		System.out.println("In the cafetaria=========>");
		feeder.eat();
	}

}
