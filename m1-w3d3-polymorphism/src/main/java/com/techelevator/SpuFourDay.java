package com.techelevator;

public class SpuFourDay implements DeliveryDriver {

private String name = "SPU (4-day ground)\t";
	
	public String getName(){
		return name;
	}
	
	public double calculateRate(double distance, double weight){
		double rate = (weight * 0.005) * distance;

		return rate;
	}
	
}
