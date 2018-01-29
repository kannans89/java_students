package com.techlabs.composition.aggregation;

public class Test {

	public static void main(String[] args) {
		
		Employee employee1=new Employee("Leena", "Seawoods", "Maharashtra", 400706);
		System.out.println(employee1);
		
		InsuarranceInfo info=new InsuarranceInfo("S11" ,"LIC POLICY");
		employee1.setInsurance(info);
		System.out.println(employee1);
		System.out.println("=========================================================");
		Employee employee=new Employee("Rahul", "Virar", "Maharashtra", 400706);
		System.out.println(employee);
	}

}
