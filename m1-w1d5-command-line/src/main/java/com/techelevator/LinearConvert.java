package com.techelevator;

import java.util.Scanner;

/*
 The foot to meter conversion formula is:
 	m = f * 0.3048
 	
 The meter to foot conversion formula is:
 	f = m * 3.2808399
 	
 Write a command line program which prompts a user to enter a length, and whether the measurement is in (m)eters or (f)eet.
 Convert the length to the opposite measurement, and display the old and new measurements to the console.
  
 $ java LinearConvert
 Please enter the length: 58
 Is the measurement in (m)eter, or (f)eet? f             
 58f is 17m.
 */

public class LinearConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the length.");
		int length = input.nextInt();
		input.nextLine();
		
		System.out.println("Is the measurment in (m)eter or (f)eet?");
		String scale = input.nextLine();
		
		if(scale.equals("m")) {
		 	//This is meter
			//f = m * 3.2808399
			float feet = (length * 3.2808399f);
			System.out.println(length + "m is " + feet + "f.");
		} else {
			//This is feet
			//m = f * 0.3048
			float meter = (length * 0.3048f);
			System.out.println(length + "f is " + meter + "m.");
		}
		
	}

}
