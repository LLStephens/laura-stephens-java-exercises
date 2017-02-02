package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class PostalServiceSecondClassTest {

	private PostalServiceSecondClass post = new PostalServiceSecondClass();

	@Test
	public void rate_for_1ounces(){
		
		Assert.assertEquals(0.35, post.calculateRate(100, 1), 0.001);	
	}
	@Test
	public void rate_for_5ounces(){
		
		Assert.assertEquals(0.40, post.calculateRate(100, 5), 0.001);	
	}
	@Test
	public void rate_for_11ounces(){
		
		Assert.assertEquals(0.47, post.calculateRate(100, 11), 0.001);	
	}
	@Test
	public void rate_for_32ounces(){
		
		Assert.assertEquals(1.95, post.calculateRate(100, 32), 0.001);	
	}
	@Test
	public void rate_for_49ounces(){
		
		Assert.assertEquals(4.50, post.calculateRate(100, 49), 0.001);	
	}
	@Test
	public void rate_for_129ounces(){
		
		Assert.assertEquals(5.00, post.calculateRate(100, 129), 0.001);	
	}
}
