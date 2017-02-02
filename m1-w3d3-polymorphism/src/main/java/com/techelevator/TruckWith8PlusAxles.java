package com.techelevator;

public class TruckWith8PlusAxles implements Vehicle{
	private String name = "Truck (8+ axles)";
	public TruckWith8PlusAxles(){
	}
	
	@Override
	public String getName(){
		return name;
	}
	
	@Override
	public double calculateToll(double distance){
		return distance * 0.048;
	}
}