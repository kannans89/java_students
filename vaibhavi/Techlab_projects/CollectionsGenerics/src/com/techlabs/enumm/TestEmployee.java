package com.techlabs.enumm;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {

	public static void main(String[] args) {

		List<Employee> emplyeeList=new ArrayList<Employee>();
		
		Employee e1=new Employee(1, "Vaibhavi", 25000, BandType.GREEN);
		System.out.println(e1.getCount());
		
		
		Employee e2=new Employee(2, "Ashmita", 20000, BandType.YELLOW);
		System.out.println(e2.getCount());
		Employee e3=new Employee(3,"xyz",45000,BandType.RED);
		emplyeeList.add(e1);
		emplyeeList.add(e2);
		emplyeeList.add(e3);
		for(Employee e:emplyeeList)
		{
			System.out.println("Name and band is" +e.getName()+e.getBand());
		}
		
		System.out.println(e3.getCount());	
		System.out.println(e1.getCount());
		System.out.println(e2.getCount());
		System.out.println(e3.getCount());	
		
		for(BandType band: BandType.values())
		{
			System.out.println(band);
		}
		
		
	}

}
