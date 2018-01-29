package com.techlabs.factory;

public class BMWi10 implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("BMWi10 is starting");
	}

	@Override
	public void stop() {
		System.out.println("BMWi10 is stopped");
	}

}
