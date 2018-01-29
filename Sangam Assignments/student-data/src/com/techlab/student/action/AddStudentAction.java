package com.techlab.student.action;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.techlab.student.model.Student;
import com.techlab.student.service.StudentService;
public class AddStudentAction implements Action,ModelDriven<Student>
{

	private Student student;
	private boolean postBack=false;
	
	public boolean isPostBack() {
		return postBack;
	}
	public void setPostBack(boolean postBack) {
		this.postBack = postBack;
	}
	public AddStudentAction() {
		System.out.println("Inside AddStudentAction constructor");
	}
	@Override
	public String execute() throws Exception {
		if(postBack)
		{
			System.out.println("Post call");
			new StudentService().addStudent(student);
			return "success";
		}
		else
		{
			System.out.println("get Call");
			return "firstTime";
		}
	}
	@Override
	public Student getModel() {
			student=new Student();
		return student;
	}

}
