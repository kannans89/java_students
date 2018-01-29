package com.techlabs.fitness.validation.service;

public class ValidationService {
	private int limit = 120;

	public boolean validateGoal(int time) {
		return (time < getLimit() && time>0);
	}

	public int getLimit() {
		return this.limit;
	}
}
