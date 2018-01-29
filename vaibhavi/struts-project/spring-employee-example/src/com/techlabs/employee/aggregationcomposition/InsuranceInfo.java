package com.techlabs.employee.aggregationcomposition;

public class InsuranceInfo {
	String policyName;
	  String policyId;
	  
	  public InsuranceInfo(String policyName,String policyId)
	  {
		  this.policyId=policyId;
		  this.policyName=policyName;
		  System.out.println("Inside constructor of InsuranceInfo");
	  }

	@Override
	public String toString() {
		return "InsuranceInfo [policyName=" + policyName + ", policyId=" + policyId
				+ "]";
	}

}
