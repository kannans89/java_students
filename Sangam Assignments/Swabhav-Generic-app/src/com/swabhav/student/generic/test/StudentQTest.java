package com.swabhav.student.generic.test;
import com.swabhav.student.generic.StudentQ;
import com.swabhav.techlabs.generic.SwabhavQ;

public class StudentQTest {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		SwabhavQ<StudentQ> studentQueue=new SwabhavQ<StudentQ>();
		StudentQ stud1=new StudentQ(1,10,"Ajay","Rikame",8.00);
		StudentQ stud2=new StudentQ(2,10,"Sangam","Kaware",7.00);
		StudentQ stud3=new StudentQ(3,10,"Pratik","Ratti",8.00);
		StudentQ stud4=new StudentQ(4,10,"Santosh","Mhatre",8.00);
		StudentQ stud5=new StudentQ(5,10,"Sandeep","Patil",8.00);
		
		studentQueue.enqueue(stud1);
		studentQueue.enqueue(stud2);
		studentQueue.enqueue(stud3);
		studentQueue.enqueue(stud4);
		studentQueue.enqueue(stud5);
		//studentQueue.dequeue();
		printStudentData(studentQueue);
		System.out.println("\nQueue Size = "+studentQueue.getSize());
		
	}@SuppressWarnings("rawtypes")
	public static void printStudentData(SwabhavQ<StudentQ> list)
	{
		for(StudentQ stud:list)
		{
			 System.out.println("\nRoll No    = "+stud.getRollNo()+
	            		"\nStandard   = "+stud.getStandard()+
	            		"\nFirst Name = "+stud.getFirstName()+
	            		"\nLast Name  = "+stud.getLastName()+
	            		"\nCGPA       = "+stud.getCGPA());
		}
	}	
}
