package com.swabhav.student.generic;


public class StudentQ<T>{
	private int getRollNo;
	private int getStandard;
	private String getFirstName;
	private String getLastName;
	private double getCGPA;
	
	public StudentQ(int rollNo,int standard,String firstName,String lastName,double cgpa)
	{
		getRollNo=rollNo;
		getStandard=standard;
		getFirstName=firstName;
		getLastName=lastName;
		getCGPA=cgpa;

	}
	public int getRollNo()
	{
		return getRollNo;
	}
	public int getStandard()
	{
		return getStandard;
	}
	public String getFirstName()
	{
		return getFirstName;
	}
	public String getLastName()
	{
		return getLastName;
	}
	public double getCGPA()
	{
		return getCGPA;
	}
	
}
