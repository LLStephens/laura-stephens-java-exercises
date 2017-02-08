package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class KataFizzBuzz {
	
	private List<String> myList;
	
	public List<String> convert(int number){
		myList = new ArrayList<String>();
		
		if(number > 0 && number < 101){
			
			
				if(number % 3 == 0 && number % 5 == 0){
					myList.add("FizzBuzz");
				}else if(number %3 == 0 || String.valueOf(number).contains("3")){
					myList.add("Fizz"); 
				}else if(number %5 ==0 || String.valueOf(number).contains("5")){
					myList.add("Buzz");
				} else {
					myList.add(Integer.toString(number));
				}
		
		
		} else {
			myList.add(" ");
		}
			return myList;
	} 
}
