package com.techlab.student.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.techlab.student.model.Student;
public class StudentService {
	//private static List<Student> studentList=new ArrayList<Student>();
	private static Map<Integer,Student> studentMap=new TreeMap<Integer,Student>();
	public StudentService() {
		System.out.println("Student service constructor");
	}
	public void addStudent(Student student)
	{
		studentMap.put(student.getRollNo(),student);
		//studentList.add(student);
		//System.out.println("size="+studentList.size());
	}
	public Map<Integer,Student> displayStudents()
	{
		return studentMap;
	}
	public Student getStudent(int rollNo)
	{
		/*for(Student student:studentList)
		{
			if(student.getRollNo()==rollNo)
			{
				System.out.println("Student roll No="+student.getRollNo());
				return student;
			}
		}*/
		return studentMap.get(rollNo);
	}
	public void updateStudent(Student student,int rollNo)
	{
		/*int index=0;
		for(Student editStudent:studentList)
		{
			if(editStudent.getRollNo()==student.getRollNo())
			{
				studentList.set(index, student);
				//System.out.println("Student roll No="+student.getRollNo());
			}
			index++;
		}*/
	}
	public void deleteStudent(int rollNo)
	{
		/*Student stud=null;
		for(Student student:studentList)
		{
			stud=student;
			if(stud.getRollNo()==rollNo)
			{
				System.out.println(stud);
				break;
			}
		}
		studentList.remove(stud);*/
		if(studentMap.containsKey(rollNo))
			studentMap.remove(rollNo);
	}
}
