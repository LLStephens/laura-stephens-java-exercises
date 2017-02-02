package com.techelevator;

import org.junit.Assert;
import org.junit.Test;


public class CarTest {

	private Car car = new Car();
	
	@Test
	public void toll(){
		Assert.assertEquals(2.00, car.calculateToll(100), 0.001);
		}
}

