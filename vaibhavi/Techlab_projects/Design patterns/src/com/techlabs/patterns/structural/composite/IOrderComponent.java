package com.techlabs.patterns.structural.composite;

public interface IOrderComponent {
	
	public void DisplayInfo();
	public void add(IOrderComponent component);

}
