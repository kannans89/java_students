package com.techlabs.enumm;

public class Employee {

	private String name;
	private BandType band;
	private double salary;
	private int id;
	private  static int count;
	
	static
	{
		count=100;
		System.out.println("Static block is executing");
	}
	public Employee(int id,String name,double salary,BandType band)
	{
		this.band=band;
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.band=band;
		count++;
	}
	public String getName() {
		return name;
	}
	public BandType getBand() {
		return band;
	}
	public double getSalary() {
		return salary;
	}
	public int getId() {
		return id;
	}
	public  int getCount() {
		
		
		return count;
	}
	
}
