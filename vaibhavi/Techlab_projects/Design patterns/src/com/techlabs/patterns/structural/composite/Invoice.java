package com.techlabs.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Invoice implements IOrderComponent {
	
	List<IOrderComponent> items=new ArrayList<IOrderComponent>();
	String name;
	String Description;
	
	public Invoice(String name,String Description)
	{
		this.Description=Description;
		this.name=name;
	}
	
	
	public void add(IOrderComponent item)
	{
		items.add(item);
	}

	@Override
	public void DisplayInfo() {

		for(IOrderComponent list:items)
		{
			System.out.println(getName());
			System.out.println(getDescription());
			list.DisplayInfo();
		}
	}


	public String getName() {
		return name;
	}


	public String getDescription() {
		return Description;
	}

}
