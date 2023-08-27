package com.company.zoo;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);
	}

	@Override
	public void makeNoise() {
		System.out.println("Gav-Gav");
	}

	@Override
	public void getDescription() {
		System.out.println("This is a dog");
	}

}
