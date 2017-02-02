package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class TruckWith8PlusAxlesTest {

	private TruckWith8PlusAxles truck = new TruckWith8PlusAxles();
	
	@Test
	public void toll(){
		Assert.assertEquals(4.80, truck.calculateToll(100), 0.001);
		}
}