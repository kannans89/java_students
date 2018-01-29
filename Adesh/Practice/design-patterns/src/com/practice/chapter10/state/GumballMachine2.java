package com.practice.chapter10.state;

public class GumballMachine2 {
	private State soldOutState;
	private State soldState;
	private State noQuarterState;
	private State hasQuarteState;
	
	State state = soldOutState;
	int count = 0;
	
	public GumballMachine2(int numberGumballs){
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarteState = new HasQuarteState(this);
		soldState = new SoldState(this);
		this.count = numberGumballs;
		if(numberGumballs > 0){
			state = noQuarterState;
		}
	}

	public void insertQuarter(){
		state.insertQuarter();
	}
	
	public void ejectQuarter(){
		state.ejectQuarter();
	}
	
	public void turnCrank(){
		state.turnCrank();
		state.dispense();
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public void releaseBall(){
		System.out.println("A gumball comes rolling out the slot..");
		if(count != 0){
			count = count - 1;
		}
	}

	public int getCount() {
		return count;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarteState() {
		return hasQuarteState;
	}
}
