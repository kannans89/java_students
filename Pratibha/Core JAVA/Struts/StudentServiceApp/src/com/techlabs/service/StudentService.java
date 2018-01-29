package com.techlabs.service;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Student;

public class StudentService {
private static List<Student> list;
static{
	list=new ArrayList<Student>();
	list.add(new Student("Pratibha", 1, 10));
	list.add(new Student("Indu", 3, 20));
	list.add(new Student("Rahul", 2, 12));
}
public static List<Student> getStudentList(){
	return list;
}
public void addStudent(Student student){
	list.add(student);
}

public void editStudent(int id, Student student){
	System.out.println("editStudent");
	System.out.println(student.getName()+student.getRollno());
	
list.set(id, student);
}
public void deleteStudent(int id) {
list.remove(id);	
}
}
