package com.techelevator.product;

public class ProductTest {

	public static void main(String[] args) {
		
		// write code here that verifies the functionality of your Product class
		
	boolean allTestsPassed = true;
		
	Product product = new Product();
	
	//name
	product.setName("Target");
	if(product.getName().equals("Target")==false){
		allTestsPassed=false;
		System.out.println("Test FAILED: The returned result should be Target but it was " + product.getName());
	}
	
	//Price
	product.getPrice();
	if(product.getPrice()!=0){
		allTestsPassed=false;
		System.out.println("Test FAILED: The returned results should be zero when Product is created with no arg constructor");
	}
	
	product.setPrice(10.00);
	if(product.getPrice() != 10.00){
		allTestsPassed=false;
		System.out.println("Test FAILED: The returned result should be 10.00 but it was " + product.getPrice());
	}
	
	product.setPrice(-10.00);
	if(product.getPrice() != 10.00){
		allTestsPassed=false;
		System.out.println("Test FAILED: The returned result should be 10.00 but it was " + product.getPrice());
	}
	
	//Weight
	product.getWeightInOunces();
	if(product.getWeightInOunces()!=0){
		allTestsPassed=false;
		System.out.println("Test FAILED: The returned results should be zero when Product is created with no arg constructor");
	}
	product.setWeightInOunces(10);
	if(product.getWeightInOunces() != 10){
		allTestsPassed=false;
		System.out.println("Test FAILED: The returned result should be 10 but it was " + product.getWeightInOunces());
	}
	product.setWeightInOunces(-10);
	if(product.getWeightInOunces() != 10){
		allTestsPassed=false;
		System.out.println("Test FAILED: The returned result should be 10 but it was " + product.getWeightInOunces());
	}
	
	//ALL TESTS PASSED	
	if(allTestsPassed) {
		System.out.println("All tests PASSED!");
	}
}

}
