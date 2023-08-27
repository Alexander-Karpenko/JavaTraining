package com.company.university;

import java.lang.reflect.*;

public class Student {

	String fullName;
	
	String group;
	
	public double averageMark;

	public Student(String fullName, String group, double averageMark) {
		this.fullName = fullName;
		this.group = group;
		this.averageMark = averageMark;
	}
	
	public void getScholarship(Student Student)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Class<Student> studentClass = Student.class;
		Field getAverageMarkField = studentClass.getDeclaredField("averageMark");
		Double getAverageMark = getAverageMarkField.getDouble(Student);
		int Scholarship = 0;
		if (getAverageMark == 4) {
			Scholarship = 2700;
		} else if (getAverageMark > 4 && getAverageMark <= 4.99) {
			Scholarship = 3100;
		} else if (getAverageMark == 5) {
			Scholarship = 3500;
		}
		System.out.println( Scholarship);
	}

	@Override
	public String toString() {
		return "Student [fullName=" + fullName + ", group=" + group + ", averageMark=" + averageMark + "]";
	}
	
}
