package com.techelevator;

import org.junit.Assert;
import org.junit.Test;


public class TankTest {

	private Tank tank = new Tank();
	
	@Test
	public void toll(){
		Assert.assertEquals(0.00, tank.calculateToll(100), 0.001);
		}
}