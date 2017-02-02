package com.techelevator;

public class Tank implements Vehicle{
	private String name = "Tank\t\t";
	
	public Tank(){
	}
	
	@Override
	public String getName(){
		return name;
	}
	
	@Override
	public double calculateToll(double distance){
		return 0.0;
	}
}