package com.techlabs.struct.spring.hibernate.viewmodel;

import com.techlabs.struct.spring.hibernate.entities.Student;

public class EditStudentViewModel {
private boolean postBack=false;
private Student student;
private int editData;
public int getEditData() {
	return editData;
}
public void setEditData(int editData) {
	this.editData = editData;
}
public boolean isPostBack() {
	return postBack;
}
public void setPostBack(boolean postBack) {
	this.postBack = postBack;
}
public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}
}
