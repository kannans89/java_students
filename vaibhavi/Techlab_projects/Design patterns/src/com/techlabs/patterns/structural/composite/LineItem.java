package com.techlabs.patterns.structural.composite;

public class LineItem implements IOrderComponent {
	
	String name;
	int id;

	public LineItem(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	@Override
	public void DisplayInfo() {

		System.out.println("LineItem:");
		System.out.println(getId());
		System.out.println(getName());
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	@Override
	public void add(IOrderComponent component) {
		// TODO Auto-generated method stub
		
	}

}
