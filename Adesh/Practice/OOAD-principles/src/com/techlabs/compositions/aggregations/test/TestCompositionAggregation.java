package com.techlabs.compositions.aggregations.test;

import com.techlabs.compositions.aggregations.Employee;
import com.techlabs.compositions.aggregations.InsuranceInfo;

public class TestCompositionAggregation {

	public static void main(String[] args) {

		Employee emp = new Employee("adesh", "navi mumbai", "maharashtra",
				"400 705");
		System.out.println(emp);

		InsuranceInfo insurance = new InsuranceInfo(101, "LIC");
		emp.setInsuranceInfo(insurance);
		System.out.println(emp);
	}

}
