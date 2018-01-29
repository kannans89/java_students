package com.techlabs.composition.aggregation.test;

import com.techlabs.composition.aggregation.Employee;
import com.techlabs.composition.aggregation.InsuranceInfo;

public class Test {

	public static void main(String[] args) {

		Employee emp1=new Employee("Pankaj", "MG Road", "Kalyan", "Maharashtra", 421301);
		System.out.println(emp1);
		
		InsuranceInfo insurance=new InsuranceInfo("Life Insurance",101);
		emp1.setInsuranceInfo(insurance);
		System.out.println(emp1);
	}

}
