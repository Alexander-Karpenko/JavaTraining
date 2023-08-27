package com.company.zoo;

public  abstract class Animal {

	String name;
	
	
	public Animal(String name) {
		this.name = name;
	}

	public void makeNoise() {
		System.out.println("Animal sound");
	}
	
	public void eat(String food []) {
		for (int i = 0; i < food.length ; i++) {
			System.out.println(food[i]);
			System.out.println();
		}
	}
	
	public void getDescription() {
	System.out.println("Animals description");
	}
	
		
}
