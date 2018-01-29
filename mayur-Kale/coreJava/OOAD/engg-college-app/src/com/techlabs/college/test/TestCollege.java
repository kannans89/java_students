package com.techlabs.college.test;

import java.util.Date;

import com.techlabs.college.BranchType;
import com.techlabs.college.Professor;
import com.techlabs.college.Student;

public class TestCollege {

	public static void main(String[] args) {

		Student student = new Student(24, "Panvel", new Date(1994, 12, 24),
				"Mayur", BranchType.COMPUTER);
		Professor professor = new Professor(100, "Andheri",
				new Date(1980, 3, 5), "Kannan", new Date(2013, 2, 10));
		professor.calculateSalay();
		System.out.println(student);
		System.out.println(professor);
	}
}
