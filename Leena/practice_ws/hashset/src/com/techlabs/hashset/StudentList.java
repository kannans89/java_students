package com.techlabs.hashset;

public class StudentList implements Comparable<StudentList> {
	
	private int rollNo;
	private String studentFirstName;
	private String studentLastName;
	
	
	public boolean equals(Object otherStudent){
		StudentList student=(StudentList)otherStudent;
		/*if( (getStudenFirsttName()+getLastName()).equals(student.studentFirstName+student.studentLastName)){
			String True=getStudenFirsttName()+getLastName()+" Already Exist";
		}*/	
		
	return (getStudenFirsttName()+getLastName()).equals(student.studentFirstName+student.studentLastName);
	
	}
	
	public int hashCode(){
		return studentFirstName.hashCode();
	}
	
	
	public StudentList(int rollNo,String firstName,String lastName){
		this.rollNo=rollNo;
		this.studentFirstName=firstName;
		this.studentLastName=lastName;
	}
	
	public int getRollNo(){
		return rollNo;
	}
	
	public String getStudenFirsttName(){
		return studentFirstName;
	}
	
	public String getLastName(){
		return studentLastName;
	}
	
	@Override
	public String toString(){
		
		return "Roll No. "+this.rollNo +" "+this.studentFirstName+" "+this.studentLastName;
	}

	@Override
	public int compareTo(StudentList student) {
		return (studentFirstName+studentLastName).compareTo(student.studentFirstName+student.studentLastName);
		
	}

}
