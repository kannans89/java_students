package com.techlabs.service;


public class ValidationService {
	private int limit=120;
public boolean	validateGoal(int time){
	return (time<getLimit());
}
public int getLimit(){
	return this.limit;
}
}
