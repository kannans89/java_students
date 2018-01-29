package com.techlabs.patterns.structural.decorator.ex1;

public abstract class SandwitchDecorator implements ISandwitch{
	
protected ISandwitch customSandwitch;
	
	public SandwitchDecorator(ISandwitch customSandwitch) {
		this.customSandwitch=customSandwitch;
	}

	public String makeSandwitch() {
		// TODO Auto-generated method stub
		return null;
	}

}
