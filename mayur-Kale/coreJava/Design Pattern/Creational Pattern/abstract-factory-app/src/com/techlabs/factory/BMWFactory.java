package com.techlabs.factory;

public class BMWFactory implements IAutoMobileFactory {

	@Override
	public IAutoMobile makeSUV() {
		return new BMWi30();
	}

	@Override
	public IAutoMobile makeSedan() {
		return new BMWi20();
	}

	@Override
	public IAutoMobile makeHatchBack() {
		return new BMWi10();
	}

}
