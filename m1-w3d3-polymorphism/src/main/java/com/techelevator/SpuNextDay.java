package com.techelevator;

public class SpuNextDay implements DeliveryDriver{
	
	private String name = "SPU (next day)\t\t";
	
	public String getName(){
		return name;
	}
	
	public double calculateRate(double distance, double weight){
		double rate = (weight * 0.075) * distance;
		
		return rate;
	}
	
	
}
