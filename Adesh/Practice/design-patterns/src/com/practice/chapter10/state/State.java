package com.practice.chapter10.state;

public interface State {
	public abstract void insertQuarter();
	public abstract void ejectQuarter();
	public abstract void turnCrank();
	public abstract void dispense();
}
