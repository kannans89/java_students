package com.practice.chapter10.state;

public class SoldOutState implements State {
private GumballMachine2 gumballMachine2; 
	
	public SoldOutState(GumballMachine2 gumballMachine2){
		this.gumballMachine2 = gumballMachine2;
	}
	
	public void insertQuarter() {
		System.out.println("u cant insert a quarter the machine is sold out");
	}

	public void ejectQuarter() {
		System.out.println("u cant eject, u havnt inserted a quarter yet");
	}

	public void turnCrank() {
		System.out.println("u turned, but there r no gumball");
	}

	public void dispense() {
		System.out.println("no gumball dispensed");
	}

}
