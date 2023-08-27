package com.company.OOP;

public class Phone {

	double Diagonal;

	String Model;
	
	int Weight;
	
	String Name;

	public Phone(double diagonal, String model, int weight, String name) {
		Diagonal = diagonal;
		Model = model;
		Weight = weight;
		Name = name;
	}

	public Phone(double diagonal, String model) {
		Diagonal = diagonal;
		Model = model;
	}
	
	public Phone() {
		Diagonal = 0;
		Model = "";
		Weight = 0;
		Name = "";
	}

	public String receiveCall() {
		return "Calling " + Name;
	}
	
	
	
	@Override
	public String toString() {
		return "Phone [Diagonal=" + Diagonal + ", Model=" + Model + ", Weight=" + Weight + ", Name=" + Name + "]";
	}

	public double getDiagonal() {
		return Diagonal;
	}

	public void setDiagonal(double diagonal) {
		Diagonal = diagonal;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public int getWeight() {
		return Weight;
	}

	public void setWeight(int weight) {
		Weight = weight;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	

}

