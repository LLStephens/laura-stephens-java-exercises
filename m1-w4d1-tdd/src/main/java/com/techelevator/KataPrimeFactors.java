package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class KataPrimeFactors {
	
	
	
	public List<String> factorize(int number){
		
		List<String> myList = new ArrayList<String>();
	
//		while (number % 2 ==0){
//			myList.add(2);
//			number = number/2;
//		} 
//		while (number % 3 ==0){
//			myList.add(3);
//			number = number/3;
//		}  
//		while (number % 5 ==0){
//			myList.add(5);
//			number = number/5;
//		}  
//		while (number % 7 ==0){
//			myList.add(7);
//			number = number/7;
//		}  
		
        for (int i = 2; i <= number; i++) { 
            while (number % i == 0) {
            	
            	myList.add(Integer.toString(i));
            	number /= i;
            }
    }
		return myList;
	}
	
}
