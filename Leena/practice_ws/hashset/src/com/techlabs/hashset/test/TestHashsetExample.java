package com.techlabs.hashset.test;
import java.util.*;

import com.techlabs.hashset.StudentList;

public class TestHashsetExample {

	public static void main(String[] args) {
		
		ArrayList<StudentList> myList=new ArrayList<StudentList>();
		myList.add(new StudentList(01,"Leena","Khetle"));
		myList.add(new StudentList(02, "Aniket","Khetle"));
		myList.add(new StudentList(03, "Sheetal","Ghodake"));
		
		System.out.println("Students List :");
		System.out.println(myList);
		System.out.println("====================================================================================");
		System.out.println("After applying HashSet : ");
		HashSet<StudentList> studentset=new HashSet<StudentList>();
		studentset.addAll(myList);
		// myList.get(0).equals(myList.get(1));
		
		if(myList.get(0).equals(myList.get(1))){
			System.out.println(myList.get(0)+ " Already exist");
			System.out.println(myList.get(0).hashCode());
			System.out.println(myList.get(1).hashCode());
			System.out.println("hence, two objects are equal their hash codes are equal..");
			
		}
		System.out.println(myList.get(0).hashCode());
		System.out.println(myList.get(1).hashCode());
		System.out.println(myList.get(2).hashCode());
		 System.out.println(studentset);
		
		
	}
	
	
	}
