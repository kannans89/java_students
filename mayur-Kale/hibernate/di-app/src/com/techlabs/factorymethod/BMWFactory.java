package com.techlabs.factorymethod;

public class BMWFactory implements IAutoFactory {

	@Override
	public IAutoMobile make() {
		return new BMW();
	}

}
