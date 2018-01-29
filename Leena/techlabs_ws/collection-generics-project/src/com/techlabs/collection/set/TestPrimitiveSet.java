package com.techlabs.collection.set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class TestPrimitiveSet {

	public static void main(String[] args) {
		Set<Integer> uniqueDeptNo=new HashSet<Integer>();
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter 5 department no");
		
		for(int index=1;index<=5;index++){
			uniqueDeptNo.add(scr.nextInt());
		}
		System.out.println("Department No. are : ");
		printSet(uniqueDeptNo);
		
		
	}

	private static void printSet(Set<Integer> uniqueDeptNo) {
		for(Integer number:uniqueDeptNo){
			System.out.println(number);
		}		
	}

	

}
