package com.company.OOP;

public class PhoneRun {

	public static void main(String[] args) {
		Phone Nokia = new Phone (6.2, "Nokia", 230, "Vasia");
		Phone Pixel5 = new Phone (5.8, "Pixel5", 180, "Kolia");
		Phone Iphone8 = new Phone (5.7, "Iphone", 190, "Misha");
		Phone SonyV1 = new Phone (6.2, "SonyV1");
		
		System.out.println(Nokia);		
		System.out.println(Pixel5);		
		System.out.println(Iphone8);
		
		System.out.println(Nokia.receiveCall());
	}

}
