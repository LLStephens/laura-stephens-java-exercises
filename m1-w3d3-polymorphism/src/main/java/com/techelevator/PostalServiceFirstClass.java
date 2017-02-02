package com.techelevator;

public class PostalServiceFirstClass implements DeliveryDriver{
	private String name = "Postal Service (1st class)";
	private double rate;
	private double distance;
	
	public PostalServiceFirstClass(){
	}
	
	public String getName(){
		return name;
	}

	@Override
	public double calculateRate(double distance, double weight) {
	if(weight <=2) {
		rate = 0.035;
	} else if(weight <=8) {
		rate = 0.040;
	} else if (weight <=15) {
		rate = 0.047;
	} else if (weight <=48) {
		rate = 0.195;
	} else if (weight <=128) {
		rate = 0.450;
	} else {
		rate = 0.5;
	} 
	return distance * rate;
	}
	
//	double [] [] costScale = { {0.035, 0.0035, 0.002}, {0.040, 0.0040, 0.0022}, {0.047, 0.0047, 0.0024}, 
//			{0.195, 0.0195, 0.0150}, {0.45, 0.045, 0.016}, {0.5, 0.05, 0.17} };
//	
//	
//	@Override
//	public double calculateRate(double distance, double weight){
//	
//		if(mailClass == 1){
//			colIndex = 0;
//		} else if (mailClass == 2){
//			colIndex = 1;
//		} else if (mailClass == 3){
//			colIndex = 2;
//		}
//		
//		if(isOunces){
//			if(weight > 0 && weight <=2){
//				rowIndex = 0;
//			}else if (weight >2 && weight <= 8){
//				rowIndex = 1;
//			}else if (weight >8){
//				rowIndex = 2;
//		}
//			
//		if(isOunces=false){
//			if(weight > 1 && weight <=3){
//				rowIndex = 0;
//			}else if (weight >4 && weight <= 8){
//				rowIndex = 1;
//			}else if (weight >9){
//				rowIndex = 2;
//			}
//		}
//	}
//		rate = costScale [rowIndex] [colIndex] * distance;
//		return rate;
//	
//		
//	}
//	
}

