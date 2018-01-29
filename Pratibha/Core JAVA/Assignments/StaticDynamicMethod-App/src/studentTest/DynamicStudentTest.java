package studentTest;

import student.DynamicStudent;

public class DynamicStudentTest {
public static void main(String[] args) {
	DynamicStudent ds1=new DynamicStudent(777);
	System.out.println("id: "+ds1.getId());
	//System.out.println(DynamicStudent.getId());C-error
}
}
