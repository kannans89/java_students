package com.techlabs.composition.aggregation;

public class InsuranceInfo {
	
  String policyName;
  String policyId;
  
  public InsuranceInfo(String policyName,String policyId)
  {
	  this.policyId=policyId;
	  this.policyName=policyName;
  }

@Override
public String toString() {
	return "InsuranceInfo [policyName=" + policyName + ", policyId=" + policyId
			+ "]";
}

}
