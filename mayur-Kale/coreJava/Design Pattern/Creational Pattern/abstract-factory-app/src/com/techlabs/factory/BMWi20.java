package com.techlabs.factory;

public class BMWi20 implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("BMWi20 is starting");
	}

	@Override
	public void stop() {
		System.out.println("BMWi20 is stopped");
	}

}
