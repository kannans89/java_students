package com.techlabs.enumerations.test;

import com.techlabs.enumerations.BandType;
import com.techlabs.enumerations.Employee;

public class Test {

	public static void main(String[] args) {

		Employee emp1 = new Employee(1, "Pankaj", 25000, BandType.GREEN);
		System.out.println(emp1.getCount());
		System.out.println(emp1.getType());

		Employee emp2 = new Employee(2, "Sachin", 10000, BandType.YELLOW);
		System.out.println(emp2.getCount());
		System.out.println(emp2.getType());

		Employee emp3 = new Employee(3, "Suresh", 15000, BandType.RED);
		System.out.println(emp3.getCount());
		System.out.println(emp3.getType() + "\n");

		for (BandType band : BandType.values()) {
			System.out.println(band);

		}
	}

}
