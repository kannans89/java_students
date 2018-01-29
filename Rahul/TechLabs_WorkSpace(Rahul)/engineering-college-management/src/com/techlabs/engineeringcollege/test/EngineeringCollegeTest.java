package com.techlabs.engineeringcollege.test;

import com.techlabs.engineeringcollege.Branch;
import com.techlabs.engineeringcollege.Subjects;
import com.techlabs.engineeringcollege.paygrades.GradeA;
import com.techlabs.engineeringcollege.paygrades.GradeB;
import com.techlabs.engineeringcollege.person.Principle;
import com.techlabs.engineeringcollege.person.Professor;
import com.techlabs.engineeringcollege.person.Student;
import com.techlabs.engineeringcollege.printer.Printer;

public class EngineeringCollegeTest {

	public static void main(String[] args) {
		Printer print = new Printer();
		Student studentObject1 = new Student(101, "Kanan",
				"102,B,Shree Vihar,MG Road,Dombivali(w)-400102", "12/10/1987",
				Branch.ComputerEngineering);

		Student studentObject2 = new Student(102, "Rahul",
				"101,A,Star Co.Ho.Society,MM Road,Andheri(E)-400012",
				"15/05/1992", Branch.CivilEngineering);
		
		// print.printInfo(studentObject1);
		// print.printInfo(studentObject2);
		System.out.println(studentObject1);
		System.out.println(studentObject2);
		
		Subjects[] subjectList = new Subjects[3];
		subjectList[0] = Subjects.EngineeringMathamatics3;
		subjectList[1] = Subjects.ADBMS;
		subjectList[2] = Subjects.OperitingSystems;

		GradeB payGradeB = new GradeB();
		Professor professorobject1 = new Professor(201, "Pravin",
				"A,401,Navkar Vihar,KL Road,Bandra(w)", "22/01/1988",
				subjectList, payGradeB);
		
		GradeA payGradeA = new GradeA();
		Principle principalObject1 = new Principle(001, "mayuresh","A1,Shree Hari Vihar,YK Nagar,Parel(w)-400002", "2/07/1965",payGradeA);
		System.out.println(principalObject1);
		System.out.println(professorobject1);
		print.printSalary(professorobject1);
		

	}

}
