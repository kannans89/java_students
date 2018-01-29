package com.techlabs.compositions.aggregations.test;

import com.techlabs.compositions.aggregations.Employee;
import com.techlabs.compositions.aggregations.InsuranceInfo;

public class TestCompositionsAggregations {

	public static void main(String[] args) {
		
		Employee empAdesh  = new Employee("adesh", "navi mumabai", "maharashtra", "400708");
		System.out.println(empAdesh);
		
		InsuranceInfo insurance = new InsuranceInfo(101, "LIC");
		empAdesh.setInsurance(insurance);
		System.out.println(empAdesh);
	}

}
