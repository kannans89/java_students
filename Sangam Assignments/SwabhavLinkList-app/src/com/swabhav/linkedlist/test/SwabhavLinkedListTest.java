package com.swabhav.linkedlist.test;

import com.techlabs.swabhavlinklist.Student;
import com.techlabs.swabhavlinklist.SwabhavLinkList;

public class SwabhavLinkedListTest {

	public static void main(String[] args) 
	{
		Student stud1 = new Student(1, 10, "Sangam", "Kaware", 7.00);
		Student stud2 = new Student(2, 10, "Vilas", "Kaware", 8.00);
		SwabhavLinkList<Student> swabhav = new SwabhavLinkList<Student>();
		swabhav.add(stud1);
		swabhav.add(stud2);
		printData(swabhav);
		
		SwabhavLinkList<Integer> swabhav1=new SwabhavLinkList<Integer>();
		swabhav1.add(10);
		swabhav1.add(20);
		swabhav1.add(30);
		printIntegerData(swabhav1);
	}

	public static void printData(SwabhavLinkList<Student> studentList)
	{
		for (Student student : studentList) 
		{
			System.out.println(student.getRollNo() + "\n"
					+ student.getStandard() + "\n" + student.getFirstName()
					+ "\n" + student.getLastName() + "\n" + student.getCGPA());
		}
	}
	public static void printIntegerData(SwabhavLinkList<Integer> list)
	{
		for(Integer data:list)
			System.out.println(data);
	}
}
