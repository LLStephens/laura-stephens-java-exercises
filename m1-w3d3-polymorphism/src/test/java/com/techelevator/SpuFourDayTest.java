package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SpuFourDayTest {

	private SpuFourDay mail = new SpuFourDay();
	
	@Test
	public void rate_test(){
		Assert.assertEquals(0.10, mail.calculateRate(2, 10), 0.001);
	}
	@Test
	public void rate_test_big(){
		Assert.assertEquals(1.50, mail.calculateRate(3, 100), 0.001);
	}
}