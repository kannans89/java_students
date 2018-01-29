package com.techlabs.composition.aggregation;

public class TestCompositionAggregation {

	public static void main(String[] args) {
		
		Employee e1=new Employee("Vaibhavi", "ambica","gujarat","ankleshwar","393001");
	     System.out.println(e1);
	     InsuranceInfo insuranceinfo=new InsuranceInfo("abc", "1");
	     e1.setInsurance(insuranceinfo);
	     System.out.println(e1);
	     

}
}
