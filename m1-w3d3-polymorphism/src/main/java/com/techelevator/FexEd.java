package com.techelevator;

public class FexEd implements DeliveryDriver {
	private String name = "FexEd\t\t\t";
			
	public String getName(){
		return name;
	}	
	
	public double calculateRate(double distance, double weight){
		double rate = 20;
		if(weight > 48 && distance > 500){
			rate += 8;
		} else if (weight > 48){
			rate += 3;
		} else if(distance > 500){
			rate +=5;
		} else {
			return rate;
		}
		return rate;
	}
}
