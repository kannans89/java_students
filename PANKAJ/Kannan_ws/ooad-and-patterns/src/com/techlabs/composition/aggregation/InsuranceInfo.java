package com.techlabs.composition.aggregation;

public class InsuranceInfo {

	String policyName;
	int policyID;

	public InsuranceInfo(String policyName, int policyID) {
		this.policyName = policyName;
		this.policyID = policyID;
	}

	@Override
	public String toString() {
		return "InsuranceInfo [policyName=" + policyName + ", policyID="
				+ policyID + "]";
	}

}
