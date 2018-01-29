package com.techlabs.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.techlabs.model.Student;
import com.techlabs.service.StudentService;

public class EditAction implements Action {
	private Student student;
	private boolean postBack = false;
	private int id = 0;

	public boolean isPostBack() {
		return postBack;
	}

	public void setPostBack(boolean postBack) {
		this.postBack = postBack;
	}

	public EditAction() {
		// if(student.getRollno()!=0){
		// System.out.println(student.getRollno());
		// }
		System.out.println("constructor:" + postBack);
		System.out.println("id: " + id);
	}

	@Override
	public String execute() throws Exception {
		StudentService ss = new StudentService();
		System.out.println(postBack);
		System.out.println("id: " + id);
		HttpServletRequest request = ServletActionContext.getRequest();
		String url = request.getServletPath();
		if(url.equals("/edit")){
		List<Student> list = ss.getStudentList();
		student=list.get(id);
		System.out.println(student.getRollno());
		}

		System.out.println(url);
		if (url.equals("/editstudent")) {
			System.out.println(student);
			ss.editStudent(id,student);
		}
		return "success";
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
