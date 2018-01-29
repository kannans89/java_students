package com.techlabs.composition.aggregation;

public class Test {

	public static void main(String[] args) {
		Employee employee1 = new Employee("rahul", "Mumbai", "Maharashtra", "401303");
		employee1.setInsuranceInfo("A1", "LIC");
		Employee employee2 = new Employee("Leena", "Pune", "Maharashtra", "400101");
		System.out.println(employee1);
		System.out.println("=========================================================================");
		System.out.println(employee2);

	}

}
