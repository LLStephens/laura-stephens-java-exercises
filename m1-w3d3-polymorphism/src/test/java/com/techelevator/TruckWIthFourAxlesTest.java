package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class TruckWIthFourAxlesTest {

	private TruckWithFourAxles truck = new TruckWithFourAxles();
	
	@Test
	public void toll(){
		Assert.assertEquals(4.00, truck.calculateToll(100), 0.001);
		}
}