package com.techlabs.collections.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestHashset {

	private Scanner sc;

	public void testHashset()
	{
		Set<Integer> department_no=new HashSet<Integer>();
		sc = new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter the data");
			int depNo=sc.nextInt();
			department_no.add(depNo);
		}
		System.out.println("Printing distinct departments....");
		for(Integer x:department_no)
		{
			System.out.println("Distinc departments is" +x);
		}
	}
	
	public static void main(String[] args)
	{
		TestHashset test=new TestHashset();
		test.testHashset();
	}
}
