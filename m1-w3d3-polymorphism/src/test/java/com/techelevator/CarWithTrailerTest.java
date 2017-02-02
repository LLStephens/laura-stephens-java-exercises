package com.techelevator;

import org.junit.Assert;
import org.junit.Test;


public class CarWithTrailerTest {

	private CarWithTrailer car = new CarWithTrailer();
	
	@Test
	public void toll(){
		Assert.assertEquals(3.00, car.calculateToll(100), 0.001);
		}
}