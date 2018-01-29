package com.practice.chapter10.state;

public class NoQuarterState implements State{

	private GumballMachine2 gumballMachine2; 
	
	public NoQuarterState(GumballMachine2 gumballMachine2){
		this.gumballMachine2 = gumballMachine2;
	}
	
	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		gumballMachine2.setState(gumballMachine2.getHasQuarteState());
	}

	public void ejectQuarter() {
		System.out.println("u havnt inserted a quarter");
	}

	public void turnCrank() {
		System.out.println("u turned, but thers no quarter");
	}

	public void dispense() {
		System.out.println("u need to pay first");
	}

}
