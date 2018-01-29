package com.practice.chapter10.state;

public class SoldState implements State {
private GumballMachine2 gumballMachine2; 
	
	public SoldState(GumballMachine2 gumballMachine2){
		this.gumballMachine2 = gumballMachine2;
	}
	
	public void insertQuarter() {
		System.out.println("Please wait.. we r giving alredy turned the crank");
	}

	public void ejectQuarter() {
		System.out.println("sorry u already turned the crank");
	}

	public void turnCrank() {
		System.out.println("turning twice doesnt get u another gumball");
	}

	public void dispense() {
		gumballMachine2.releaseBall();
		if(gumballMachine2.getCount() > 0){
			gumballMachine2.setState(gumballMachine2.getNoQuarterState());
		}else{
			System.out.println("Oops out of the gumballs");
			gumballMachine2.setState(gumballMachine2.getSoldState());
		}
	}

}
