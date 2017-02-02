package com.techelevator;

	public class PostalServiceThirdClass implements DeliveryDriver{
		private String name = "Postal Service (3rd class)";
		private double rate;
		
		public PostalServiceThirdClass(){
		}
		
		public String getName(){
			return name;
		}

		@Override
		public double calculateRate(double distance, double weight) {
		if(weight <=2) {
			rate = 0.002;
		} else if(weight <=8) {
			rate = 0.0022;
		} else if (weight <=15) {
			rate = 0.0024;
		} else if (weight <=48) {
			rate = 0.0150;
		} else if (weight <=128) {
			rate = 0.0160;
		} else {
			rate = 0.017;
		} return distance * rate;
		
		}
}
