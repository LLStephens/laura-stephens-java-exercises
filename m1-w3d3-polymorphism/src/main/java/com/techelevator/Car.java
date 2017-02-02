package com.techelevator;

public class Car implements Vehicle{
	private String name = "Car\t\t";
	public Car(){
	}
	
	@Override
	public String getName(){
		return name;
	}
	
	
	@Override
	public double calculateToll(double distance){
		return distance * 0.020;
	}
}
