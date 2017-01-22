package com.techelevator;

import java.util.Scanner;

/*
Write a command line program which prompts the user for a series of decimal integer values  
and displays each decimal value as itself and its binary equivalent

$ DecimalToBinary 

Please enter in a series of decimal values (separated by spaces): 460 8218 1 31313 987654321

460 in binary is 111001100
8218 in binary is 10000000011010
1 in binary is 1
31313 in binary is 111101001010001
987654321 in binary is 111010110111100110100010110001
*/
public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a series of decimal values (space-separated):");
		String value = input.nextLine(); // takes user input and stores it as a String named value
		String[] valueStrings = value.split(" "); // takes String value and splits into multiple strings stored as String array named valueStrings

		for (int i = 0; i < valueStrings.length; i++) {
			int intValue = Integer.parseInt(valueStrings[i]); // parses each  string in valueStrings array into integers called intValue
		    String binary = "";
			while (intValue > 0) {
				if (intValue % 2 == 0) {
					binary = "0" + binary;
				} else {
					binary = "1" + binary;
				}
				intValue = intValue / 2;
			}
		    System.out.println(valueStrings[i] + " in binary is " + binary);
		}
	}
}