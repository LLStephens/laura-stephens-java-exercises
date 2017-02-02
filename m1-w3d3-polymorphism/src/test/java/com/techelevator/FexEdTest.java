package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FexEdTest {

	private FexEd mail = new FexEd();
	
	@Test
	public void rate_for_standard(){
		Assert.assertEquals(20,  mail.calculateRate(10, 10), 0.001);
	}
	@Test
	public void rate_for_heavy(){
		Assert.assertEquals(23,  mail.calculateRate(10, 700), 0.001);
	}
	@Test
	public void rate_for_far(){
		Assert.assertEquals(25,  mail.calculateRate(50, 10), 0.001);
	}
	@Test
	public void rate_for_heavy_and_far(){
		Assert.assertEquals(28,  mail.calculateRate(70, 900), 0.001);
	}
}
