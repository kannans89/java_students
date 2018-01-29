
package com.techlabs.test;

import java.util.ArrayList;
import java.util.List;

import com.techlabs.model.Student;
import com.techlabs.service.StudentService;

public class StudentVeiw {
	List<Student> list;
	StudentService studentservise;

public StudentVeiw(){
	list=new ArrayList<Student>();
	studentservise=new StudentService();
}
public void getRecords(){
	list=studentservise.getList();
	for(Student stud:list){
		System.out.println("Name:"+stud.getName()+"\nAddress:"+stud.getAddress());
	}
}
}
