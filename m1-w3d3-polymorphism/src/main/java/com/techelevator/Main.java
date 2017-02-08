package com.techelevator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter weight of your shipment:");
	String heaviness = input.nextLine();
	Double weight = Double.parseDouble(heaviness);
	
	System.out.println("Is your weight in (p)ounds or (o)unces?");
	String weightType = input.nextLine();
	if(weightType.equals("p")){
		weight = weight * 16;
	}
	
	System.out.println("How far is your shipment traveling?");
	String miles = input.nextLine();
	Double distance = Double.parseDouble(miles);
	
	List<DeliveryDriver> drivers = new ArrayList<DeliveryDriver>();
	drivers.add(new PostalServiceFirstClass());
	drivers.add(new PostalServiceSecondClass());
	drivers.add(new PostalServiceThirdClass());
	drivers.add(new FexEd());
	drivers.add(new SpuFourDay());
	drivers.add(new SpuSecondDay());
	drivers.add(new SpuNextDay());
	System.out.println("Deilvery Method \t\t " + "$ cost");
	for(DeliveryDriver driver : drivers) {
		System.out.println(driver.getName() + "\t" + String.format("%.2f",driver.calculateRate(distance, weight)));
	}
	
	
	}

}
