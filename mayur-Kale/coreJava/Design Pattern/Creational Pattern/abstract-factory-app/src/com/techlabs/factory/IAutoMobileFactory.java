package com.techlabs.factory;

public interface IAutoMobileFactory {

	public IAutoMobile makeSUV();

	public IAutoMobile makeSedan();

	public IAutoMobile makeHatchBack();
}
