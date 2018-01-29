package com.techlabs.factory;

public class AudiFactory implements IAutoMobileFactory {

	@Override
	public IAutoMobile makeSUV() {
		return new Audii30();
	}

	@Override
	public IAutoMobile makeSedan() {
		return new Audii20();
	}

	@Override
	public IAutoMobile makeHatchBack() {
		return new Audii10();
	}

}
