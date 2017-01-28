package com.techelevator.product;

public class Product {
	private String name;
	private double price;
	private int weightInOunces;
	
	public Product(){
		name = new String();
		price = 0.00;
		weightInOunces = 0;
	}
	
	public String getName(){
		return name;
	}
	
	public double getPrice(){
		return price;
	}
	
	public int getWeightInOunces(){
		return weightInOunces;
	}
	
	public void setName(String name){
		if(name != null && !name.isEmpty()){
			this.name=name;
		}
	}
	
	public void setPrice(double price){
		if(price > 0){
			this.price=price;
		}
	}
	
	public void setWeightInOunces(int weightInOunces){
		if(weightInOunces > 0){
			this.weightInOunces=weightInOunces;
		}
	}
	
	
	/*
	 
	 The Product class has the following properties
	 	name
	 	price
	 	weightInOunces
	 
	 Please select an appropriate data type, and write a getter and setter for each property listed above. 
	 Note, some properties may or may not require both a getter and a setter.
	 
	 Use the main method in ProductTest.java to verify the functionality of the Product class.  
	 (Please see notes in ProductTest.java for further instructions.)
	 
	 */

	//
	// Write your code below
	//
	
}
