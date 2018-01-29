package com.techlabs.factory;

public class BMW implements IAutoMobile{

	@Override
	public void start() {
		System.out.println("BWM is starting");
		
	}

	@Override
	public void stop() {
		System.out.println("BWM is stopped");		
	}

}
