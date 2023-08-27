package com.company.university;

import java.lang.reflect.Field;

public class Aspirant extends Student {

	String scientificWork;
	
	public Aspirant(String fullName, String group, double averageMark, String scientificWork) {
		super(fullName, group, averageMark);
		this.scientificWork = scientificWork;
	}

	@Override
	public void getScholarship(Student Student)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Class<Student> studentClass = Student.class;
		Field getAverageMarkField = studentClass.getDeclaredField("averageMark");
		Double getAverageMark = getAverageMarkField.getDouble(Student);
		int Scholarship = 0;
		if (getAverageMark == 4) {
			Scholarship = 3300;
		} else if (getAverageMark > 4 && getAverageMark <= 4.99) {
			Scholarship = 3700;
		} else if (getAverageMark == 5) {
			Scholarship = 4200;
		}
		System.out.println( Scholarship);
	}

	@Override
	public String toString() {
		return "Aspirant [scientificWork=" + scientificWork + ", fullName=" + fullName + ", group=" + group
				+ ", averageMark=" + averageMark + "]";
	}

	
	

	
	

	
	

	

}
