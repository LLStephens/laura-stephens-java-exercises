package com.techelevator;

public class TruckWithFourAxles implements Vehicle{
	private String name = "Truck (4 axles)\t";
	
	public TruckWithFourAxles(){
	}
	
	@Override
	public String getName(){
		return name;
	}
	
	@Override
	public double calculateToll(double distance){
		return distance * 0.040;
	}
}
	

