package com.techlabs.factory;

public class BMWFactory implements IAutoFactory {

	@Override
	public IAutoMobile make() {
		return new BMW();
	}

}
