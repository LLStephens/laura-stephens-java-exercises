package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class PostalServiceThirdClassTest {

	private PostalServiceThirdClass post = new PostalServiceThirdClass();

	@Test
	public void rate_for_1ounces(){
		post.calculateRate(100,1);
		
		Assert.assertEquals(0.2, post.calculateRate(100, 1), 0.001);	
	}
	@Test
	public void rate_for_5ounces(){
		post.calculateRate(100, 5);
		
		Assert.assertEquals(0.22, post.calculateRate(100, 5), 0.001);	
	}
	@Test
	public void rate_for_11ounces(){
		post.calculateRate(100, 11);
		
		Assert.assertEquals(0.24, post.calculateRate(100, 11), 0.001);	
	}
	@Test
	public void rate_for_32ounces(){
		post.calculateRate(100, 32);
		
		Assert.assertEquals(1.50, post.calculateRate(100, 32), 0.001);	
	}
	@Test
	public void rate_for_49ounces(){
		post.calculateRate(100, 49);
		
		Assert.assertEquals(1.60, post.calculateRate(100, 49), 0.001);	
	}
	@Test
	public void rate_for_129ounces(){
		post.calculateRate(100, 129);
		
		Assert.assertEquals(1.70, post.calculateRate(100, 129), 0.001);	
	}
}
