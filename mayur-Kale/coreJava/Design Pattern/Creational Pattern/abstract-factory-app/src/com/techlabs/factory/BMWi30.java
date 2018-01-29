package com.techlabs.factory;

public class BMWi30 implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("BMWi30 is starting");
	}

	@Override
	public void stop() {
		System.out.println("BMWi30 is stopped");
	}

}
