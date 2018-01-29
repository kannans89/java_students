package com.techlabs.composition.aggregation;

public class InsuranceInfo {
	//instance Variables
	private String policyId;
	private String policyName;
	
	//constructor
	public InsuranceInfo(String id,String name){
		policyId = id;
		policyName = name;
	}
	
	//methods
	public String getpolicyId(){
		return policyId;
	}
	public String getpolicyName(){
		return policyName;
	}

	@Override
	public String toString() {
		return "\npolicyId :" + policyId + "\npolicyName :"
				+ policyName;
	}
	

}
