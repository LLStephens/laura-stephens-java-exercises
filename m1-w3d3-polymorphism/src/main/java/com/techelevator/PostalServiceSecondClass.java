package com.techelevator;

public class PostalServiceSecondClass implements DeliveryDriver{
	
		private String name = "Postal Service (2nd class)";
		private double rate;
		
		public PostalServiceSecondClass(){
		}
		
		public String getName(){
			return name;
		}

		@Override
		public double calculateRate(double distance, double weight) {
		if(weight <=2) {
			rate = 0.0035;
		} else if(weight <=8) {
			rate = 0.0040;
		} else if (weight <=15) {
			rate = 0.0047;
		} else if (weight <=48) {
			rate = 0.0195;
		} else if (weight <=128) {
			rate = 0.0450;
		} else {
			rate = 0.05;
		} return distance * rate;
		
		}
}
