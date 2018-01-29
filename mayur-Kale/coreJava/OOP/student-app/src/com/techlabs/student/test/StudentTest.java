package com.techlabs.student.test;

import com.techlabs.student.Student;

public class StudentTest {

	public static void main(String[] arStrings) {

		Student mayur = new Student(10, "Mayur", 7.68f);
		Student vikram = new Student(3, "Vikram", 9.5f);

		printStudentDetails(mayur);

		printStudentDetails(vikram);

		System.out.println("Mayur Hashcode: " + System.identityHashCode(mayur));

		System.out.println("Vikram Hashcode: "
				+ System.identityHashCode(vikram));

	}

	private static void printStudentDetails(Student student) {

		System.out.println("Name : " + student.getName() + " Roll No : "
				+ student.getRollno() + " Performance : "
				+ student.getPerformance() + " Percentage : "
				+ student.getPercentage());
		System.out.println("HashCode: " + System.identityHashCode(student));
	}

}
