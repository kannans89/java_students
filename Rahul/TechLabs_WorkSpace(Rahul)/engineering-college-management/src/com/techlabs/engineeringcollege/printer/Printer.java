package com.techlabs.engineeringcollege.printer;

import com.techlabs.engineeringcollege.person.Professor;
import com.techlabs.engineeringcollege.person.Student;

public class Printer {
	public void printInfo(Student studentObject) {
		System.out.println("Student ID :- "+studentObject.getId());
		System.out.println("Student Name :-"+studentObject.getName());
		System.out.println("Student Address :-"+studentObject.getAddress());
		System.out.println("Student DOB :- "+studentObject.getDOB());
		System.out.println("Student Department :- "+studentObject.getStudentDepartment());
		System.out.println("======================================================================");
		
	}
	public void printSalary(Professor professorObject){
		System.out.println("Professor ID :- "+ professorObject.getId());
		System.out.println("Professor Name :-"+professorObject.getName());
		System.out.println("Perday Salary :- "+ professorObject.perDaySalary());
		System.out.println("Total Salary:-"+professorObject.calculateSalary());
		System.out.println("======================================================================");
	}

}
