package com.swabhav.stack.test;
import com.swabhav.stack.StudentStack;
import com.swabhav.stack.SwabhavStack;

public class SwabhavStackTest {
	public static void main(String[] args) {
		SwabhavStack<StudentStack> studentStack = new SwabhavStack<StudentStack>();
		
		StudentStack stud1 = new StudentStack(1, 10, "Ajay", "Rikame", 8.00);
		StudentStack stud2 = new StudentStack(2, 10, "Sangam", "Kaware", 7.00);
		StudentStack stud3 = new StudentStack(3, 10, "Pratik", "Ratti", 8.00);

		studentStack.push(stud1);
		studentStack.push(stud2);
		studentStack.push(stud3);

		studentStack.pop();
		printStudentData(studentStack);
		System.out.println("\nStack Size = " + studentStack.getSize());
	

	}

	public static void printStudentData(SwabhavStack<StudentStack> list) {

		for (StudentStack stud : list) {
			System.out.println("\nRoll No    = " + stud.getRollNo()
					+ "\nStandard   = " + stud.getStandard()
					+ "\nFirst Name = " + stud.getFirstName()
					+ "\nLast Name  = " + stud.getLastName()
					+ "\nCGPA       = " + stud.getCGPA());
		}

	}

}
