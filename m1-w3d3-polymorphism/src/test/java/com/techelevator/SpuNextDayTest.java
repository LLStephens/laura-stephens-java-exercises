package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SpuNextDayTest {

	private SpuNextDay mail = new SpuNextDay();
	
	@Test
	public void rate_test(){
		Assert.assertEquals(1.50, mail.calculateRate(2, 10), 0.001);
	}
	@Test
	public void rate_test_big(){
		Assert.assertEquals(22.50, mail.calculateRate(3, 100), 0.001);
	}
	
	
	
	
}
