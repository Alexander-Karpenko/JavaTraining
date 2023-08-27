package com.company.university;

public class University {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		Student Zubenko = new Student("Zubenko Mihail Petrovich", "TP21", 4.5 );
		Student Kurdyk = new Student("Kurdyk Stepan Michlenovich", "SM24", 4 );
		Student Svistun = new Student("Svistun Nikita Glebovich", "DM34", 5 );
		Student Kvazimodo = new Aspirant("Kvazimodo Kall Jmihowich", "GM23", 4, "est");
		Student Students[];
		Students = new Student[4];
		Students[0] = new Student("Zubenko Mihail Petrovich", "TP21", 4.5 );
		Students[1] = new Student("Kurdyk Stepan Michlenovich", "SM24", 4 );
		Students[2] = new Student("Svistun Nikita Glebovich", "DM34", 5 );
		Students[3] = new Aspirant("Kvazimodo Kall Jmihowich", "GM23", 4, "est");
		
		System.out.println(Zubenko);
		System.out.println(Kvazimodo);
		
		for(int i = 0; i < Students.length; i++) {
		Students[i].getScholarship(Students[i]);
		}
	} 

}
