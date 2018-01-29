package com.techlabs.factorymethod;

public class AudiFactory implements IAutoFactory {

	@Override
	public IAutoMobile make() {
		return new Audi();
	}

}
