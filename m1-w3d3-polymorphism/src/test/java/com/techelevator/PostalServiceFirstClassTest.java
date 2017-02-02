package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class PostalServiceFirstClassTest {

	private PostalServiceFirstClass post = new PostalServiceFirstClass();

	@Test
	public void rate_for_1ounces(){
		post.calculateRate(10,1);
		
		Assert.assertEquals(0.35, post.calculateRate(10, 1), 0.001);	
	}
	@Test
	public void rate_for_5ounces(){
		post.calculateRate(10, 5);
		
		Assert.assertEquals(0.40, post.calculateRate(10, 5), 0.001);	
	}
	@Test
	public void rate_for_11ounces(){
		post.calculateRate(10, 11);
		
		Assert.assertEquals(0.47, post.calculateRate(10, 11), 0.001);	
	}
	@Test
	public void rate_for_32ounces(){
		post.calculateRate(10, 32);
		
		Assert.assertEquals(1.95, post.calculateRate(10, 32), 0.001);	
	}
	@Test
	public void rate_for_49ounces(){
		post.calculateRate(10, 49);
		
		Assert.assertEquals(4.50, post.calculateRate(10, 49), 0.001);	
	}
	@Test
	public void rate_for_130ounces(){
		post.calculateRate(10, 130);
		
		Assert.assertEquals(5.00, post.calculateRate(10, 130), 0.001);	
	}
	
}
