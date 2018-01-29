package com.techlabs.compositions.aggregations;

public class InsuranceInfo {
	private int id;
	private String name;
	
	public InsuranceInfo(int id, String name){
		this.id = id;
		this.name = name;
	}
	
	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}

	@Override
	public String toString() {
		return "\nInsuranceInfo id=" + id + "\nname=" + name;
	}
	
}
