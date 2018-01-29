package com.techlabs.singleton_pattern;

public class ChocolateBoiler {

	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler singleInstance=new ChocolateBoiler();
	
	
	private ChocolateBoiler()
	{
		empty=true;
		boiled=false;
	}
	
	public boolean isEmpty()
	{
		return empty;
	}
	
	public boolean isBoiled()
	{
		return boiled;
	}
	
	public static ChocolateBoiler getInstance()
	{
		return singleInstance;
	}
	
	public void fill()
	{
		if(isEmpty())
		{
			empty=false;
			boiled=false;
			System.out.println("Filling the boiler");
		}
		else
		{
			System.out.println("sorry already full");
		}
	}
	
	public void boil()
	{
		if(!isBoiled() && !isEmpty())
		{
			boiled=true;
			System.out.println("Boiling the chocolate");
		}
		else
		{
			System.out.println("Sorry Already boiled");
		}
	}
	
	public void empty()
	{
		empty=true;
	}
}
