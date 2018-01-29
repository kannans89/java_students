package com.practice.chapter10.state;

public class HasQuarteState implements State {
private GumballMachine2 gumballMachine2; 
	
	public HasQuarteState(GumballMachine2 gumballMachine2){
		this.gumballMachine2 = gumballMachine2;
	}
	
	public void insertQuarter() {
		System.out.println("u cant insert another quarter");
	}

	public void ejectQuarter() {
		System.out.println("quarter returned");
		gumballMachine2.setState(gumballMachine2.getNoQuarterState());
	}

	public void turnCrank() {
		System.out.println("u turned..");
		gumballMachine2.setState(gumballMachine2.getSoldState());
	}

	public void dispense() {
		System.out.println("no gumball dispensed");
	}

}
