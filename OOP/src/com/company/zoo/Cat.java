package com.company.zoo;

public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}

	@Override
	public void makeNoise() {
		System.out.println("Mur-mur");
	}

	@Override
	public void getDescription() {
		System.out.println("This is a cat");
	}

	

}
