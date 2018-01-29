package com.practice.chapter10.state;

public class GumballMachineTest {

	public static void main(String[] args) {
		GumballMachine gumball = new GumballMachine(5);
		
		System.out.println(gumball);
		
		gumball.insertQuarter();
		gumball.turnCrank();
		
		System.out.println(gumball);
		
		gumball.insertQuarter();
		gumball.ejectQuarter();
		gumball.turnCrank();
		
		System.out.println(gumball);
		
		gumball.insertQuarter();
		gumball.turnCrank();
		gumball.insertQuarter();
		gumball.turnCrank();
		gumball.ejectQuarter();
		
		System.out.println(gumball);
		
		gumball.insertQuarter();
		gumball.insertQuarter();
		gumball.turnCrank();
		gumball.insertQuarter();
		gumball.turnCrank();
		gumball.insertQuarter();
		gumball.turnCrank();
	}

}
