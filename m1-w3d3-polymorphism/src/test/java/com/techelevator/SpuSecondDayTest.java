package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SpuSecondDayTest {

	private SpuSecondDay mail = new SpuSecondDay();
	
	@Test
	public void rate_test(){
		Assert.assertEquals(1.00, mail.calculateRate(2, 10), 0.001);
	}
	@Test
	public void rate_test_big(){
		Assert.assertEquals(15.00, mail.calculateRate(3, 100), 0.001);
	}
}