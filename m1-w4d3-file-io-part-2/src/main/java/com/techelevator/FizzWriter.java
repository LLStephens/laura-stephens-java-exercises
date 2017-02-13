package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class FizzWriter {

	public static void main(String[] args) throws FileNotFoundException {
		List<String> myList = new ArrayList();
		try (PrintWriter fileOutput = new PrintWriter(new File ("/Users/lstephens/Desktop/FizzBuzz.txt"))) {
			for (int i = 1; i <= 300; i++) {
				if (i % 5 == 0 && i % 3 == 0) {
					myList.add("FizzBuzz");
				} else if (i % 3 == 0) {
					myList.add("Fizz");
				} else if (i % 5 == 0) {
					myList.add("Buzz");
				} else {
					myList.add(Integer.toString(i));
				}
			}	fileOutput.println(myList);
			fileOutput.flush();
		}
		catch (IOException e){
			e.getMessage();
		}
	}
}
