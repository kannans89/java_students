package studentTest;

import student.StaticStudent;

public class StaticStudentTest {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		StaticStudent.setData("Pratibha", 121, 22);
		StaticStudent ss1 = new StaticStudent("Rahul", 222, 19);
		System.out.println(StaticStudent.getName() + "    "
				+ StaticStudent.getId() + "   " + StaticStudent.getAge());
		System.out.println(ss1.getName() + "    " + ss1.getId() + "   "
				+ ss1.getAge());
	}
}
