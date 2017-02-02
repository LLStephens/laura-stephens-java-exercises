package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class TruckWIth6AxlesTest {

	private TruckWith6Axles truck = new TruckWith6Axles();
	
	@Test
	public void toll(){
		Assert.assertEquals(4.50, truck.calculateToll(100), 0.001);
		}
}