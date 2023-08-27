package com.company.zoo;

public class Bear extends Animal{

	public Bear(String name) {
		super(name);
	}

	@Override
	public void makeNoise() {
		System.out.println("Aaaargh");
	}

	@Override
	public void getDescription() {
		System.out.println("this is a bear");
	}

	
}
