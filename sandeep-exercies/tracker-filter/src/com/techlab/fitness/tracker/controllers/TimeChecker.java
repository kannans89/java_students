package com.techlab.fitness.tracker.controllers;

public class TimeChecker {

	public boolean checkTime(int time) {
		if (time <= 120) {
			return true;
		}
		return false;
	}
}
