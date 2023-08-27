package com.company.shop;

public class Shop {


	public static void main(String[] args) {
		Product dairyArray[] = null;
		Product milk = new Product("Farm milk",100,4.5);
		Product kefir = new Product("Farm kefir",90,4.3);
		dairyArray[0] = milk;
		dairyArray[1] = kefir;
		Category dairy = new Category("dairy", dairyArray);
		
	}

}
