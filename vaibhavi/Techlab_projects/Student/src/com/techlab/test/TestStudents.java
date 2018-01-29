package com.techlab.test;

import java.util.ArrayList;
import java.util.List;

import com.techlab.student.Student;

public class TestStudents {

	
	public static void main(String[] args) {
         List<Student> studentsList=null;
         studentsList=new ArrayList<Student>();
         
         Student testStudent=new Student();
         testStudent.putEntry(studentsList);
         
         System.out.println(studentsList);
         
	}

}
