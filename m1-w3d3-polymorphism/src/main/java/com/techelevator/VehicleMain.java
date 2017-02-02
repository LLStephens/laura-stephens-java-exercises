package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class VehicleMain {

	public static void main(String[] args) {
		
		List<Vehicle> autos = new ArrayList<Vehicle>();
		autos.add(new Tank());
		autos.add(new Car());
		autos.add(new CarWithTrailer());
		autos.add(new TruckWithFourAxles());
		autos.add(new TruckWith6Axles());
		autos.add(new TruckWith8PlusAxles());
		System.out.println("Vehicle\t\t" + "Distance Traveled\t"+ "Toll $");
		Double distance = 12.00;
		Double totalMiles= 0.0;
		Double totalTolls = 0.0;
		for(Vehicle vehicles : autos){		
			System.out.println(vehicles.getName() + "\t" + distance + "\t\t" + String.format( "%.2f", vehicles.calculateToll(distance)));
			totalMiles += distance;
			Double tolls  = vehicles.calculateToll(distance);
			totalTolls += tolls;
		}
		System.out.println( );
		System.out.println("Total miles: " + String.format( "%.2f", totalMiles));
		System.out.println("Total tolls: " + String.format( "%.2f", totalTolls));

		
		
	}
	
}
