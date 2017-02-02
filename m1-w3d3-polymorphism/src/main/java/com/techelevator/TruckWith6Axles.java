package com.techelevator;

public class TruckWith6Axles implements Vehicle{
	private String name = "Truck (6 axles)\t";
	public TruckWith6Axles(){
	}
	
	@Override
	public String getName(){
		return name;
	}
	
	@Override
	public double calculateToll(double distance){
		return distance * 0.045;
	}
}

