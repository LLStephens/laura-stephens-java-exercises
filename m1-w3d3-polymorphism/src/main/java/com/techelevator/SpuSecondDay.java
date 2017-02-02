package com.techelevator;

public class SpuSecondDay implements DeliveryDriver {

	private String name = "SPU (2-day business)\t";
		
		public String getName(){
			return name;
		}
		
		public double calculateRate(double distance, double weight){
			double rate = (weight * 0.050) * distance;
			return rate;
			
		}
			
	
}
