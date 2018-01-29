package com.techlabs.student;

public class Student {

	int rollno;
	String name;
	float cgpa;
	PerformanceType performance;

	public Student(int prollno, String pname, float pcpga) {
		System.out.println("Student Created");
		rollno = prollno;
		name = pname;
		cgpa = pcpga;
		setPerformance();
	}

	private void setPerformance() {

		if (cgpa <= 10 && cgpa > 9)
			performance = PerformanceType.OUTSTANDING;

		else if (cgpa <= 9 && cgpa > 7)
			performance = PerformanceType.GOOD;

		else if (cgpa <= 7)
			performance = PerformanceType.OUTSTANDING;
	}

	public PerformanceType getPerformance() {
		return performance;

	}

	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public float getCgpa() {
		return cgpa;
	}

	public float getPercentage() {
		return ((cgpa - 0.75f) * 10);

	}

}
