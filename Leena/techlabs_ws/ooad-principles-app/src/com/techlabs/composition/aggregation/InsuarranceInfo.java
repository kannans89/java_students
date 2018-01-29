package com.techlabs.composition.aggregation;

public class InsuarranceInfo {
	
	private String policyId;
	private String policyname;
	
	public InsuarranceInfo(String id,String name){
		this.policyId=id;
		this.policyname=name;
	}

	public String getPolicyId(){
		return policyId;
	}
	
	public String getPolicyName(){
		return policyname;
	}
	
	public void setPolicyId(String id){
		this.policyId=id;
	}
	
	public void setPolicyName(String name){
		this.policyname=name;
	}
	
	
}
