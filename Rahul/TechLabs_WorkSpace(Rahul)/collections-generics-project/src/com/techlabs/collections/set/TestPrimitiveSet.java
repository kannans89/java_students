package com.techlabs.collections.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TestPrimitiveSet {
	public static void main(String[] args) {
		Set<Integer> uniqueDepartNumbers = new HashSet<Integer>();

		Scanner scan = new Scanner(System.in);
		
		for (int departmentNumber = 0; departmentNumber < 5; departmentNumber++) {
			System.out.println("");
			System.out.print("Enter the Department Number :- ");
			
			uniqueDepartNumbers.add(scan.nextInt());
		}
		
		scan.close();
		for(Integer departmentNumber : uniqueDepartNumbers){
			System.out.println("Department Number :-"+departmentNumber);
		}

	}
}
