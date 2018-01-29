package com.techlabs.action;

import com.techlabs.model.Student;

public class EditVeiwModel {
Student stud;
int editId;
private int id;
public int getEditId() {
	return editId;
}

public void setEditId(int editId) {
	this.editId = editId;
}

public Student getStud() {
	return stud;
}

public void setStud(Student stud) {
	this.stud = stud;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
}
