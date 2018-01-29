package com.practice.chapter10.state;

public class GumballMachine {
	private final static int SOLD_OUT = 0;
	private final static int NO_QUARTER = 1;
	private final static int HAS_QUARTER = 2;
	private final static int SOLD = 3;
	
	int state = SOLD_OUT;
	int count = 0;
	
	public GumballMachine(int count){
		this.count = count;
		if(count > 0){
			state = NO_QUARTER;
		}
	}
	
	public void insertQuarter(){
		if(state == HAS_QUARTER){
			System.out.println("You cant insert another Quarter");
		}else if(state == NO_QUARTER){
			state = HAS_QUARTER;
			System.out.println("You inserted a Quarter");
		}else if(state == SOLD_OUT){
			System.out.println("you cant insert a Quarter, the machine is sold out");
		}else if(state == SOLD){
			System.out.println("Please wait, we r already giving you a gumball");
		}
	}
	
	public void ejectQuarter(){
		if(state == HAS_QUARTER){
			System.out.println("Quarter returned");
			state = NO_QUARTER;
		}else if(state == NO_QUARTER){
			System.out.println("You havnt inserted a Quarter");
		}else if(state == SOLD){
			System.out.println("Sorry u already turned the crack");
		}else if(state == SOLD_OUT){
			System.out.println("you cant eject u havnt inserted a quarter yet");
		}
	}
	
	public void turnCrank(){
		if(state == SOLD){
			System.out.println("turning twice doesnt get u another gumball");
		}else if(state == NO_QUARTER){
			System.out.println("You turned but theres no quarter");
		}else if(state == SOLD_OUT){
			System.out.println("you turned but der r no gumballs");
		}else if(state == HAS_QUARTER){
			System.out.println("u turned..");
			state = SOLD;
			dispense();
		}
	}
	
	public void dispense(){
		if(state == SOLD){
			System.out.println("gumball comes rollig out the slot");
			count = count - 1;
			if(count == 0){
				System.out.println("Oops out of gumballs");
				state = SOLD_OUT;
			}else{
				state = NO_QUARTER;
			}
		}else if(state == NO_QUARTER){
			System.out.println("You need to pay first");
		}else if(state == SOLD_OUT){
			System.out.println("No gumball dispensed");
		}else if(state == HAS_QUARTER){
			System.out.println("No gumball dispensed");
		}
	}

	@Override
	public String toString() {
		return "\nMighty Gumball, Inc. \nJava-enabled standing gumball Model #2004\nInventory = " + count+" gumballs\nmachine is waiting for quarter\n";
	}
}
