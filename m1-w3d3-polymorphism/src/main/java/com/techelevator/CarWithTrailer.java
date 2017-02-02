package com.techelevator;

public class CarWithTrailer implements Vehicle {
	private String name = "Car (with trailer)";
	public CarWithTrailer(){
	}
	
	@Override
	public String getName(){
		return name;
	}
	
	@Override
	public double calculateToll(double distance){
		return distance * 0.020 +1;
	}
}

