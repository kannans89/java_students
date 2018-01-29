package com.techlabs.factory;

public class Mobile {
	private Sim sim;

	public Mobile() {
		// TODO Auto-generated constructor stub
	}

	public Mobile(Sim sim) {
		this.sim = sim;
		System.out.println("Inside Mobile Constructor");
	}

	public void getMobile() {
		this.sim.getSim();
		System.out.println("Inside Mobile function");
	}
}
