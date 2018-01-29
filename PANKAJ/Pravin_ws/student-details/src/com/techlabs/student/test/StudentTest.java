package com.techlabs.student.test;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.student.Student;

public class StudentTest {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		Student studentObject = new Student();
		studentObject.putEntry(students);
		System.out.println(students);
	}

}
