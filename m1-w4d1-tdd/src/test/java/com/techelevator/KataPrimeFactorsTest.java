package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.List;

public class KataPrimeFactorsTest {
	public KataPrimeFactors primes;
	
	@Before
	public void setup(){
		primes = new KataPrimeFactors();
	}
	
	@Test
	public void given_4_return_22(){
		List<String> results = primes.factorize(4);
		
		Assert.assertEquals("2", results.get(0));
		Assert.assertEquals("2", results.get(1));	
	}
	
	@Test
	public void given_6_return_23(){
		List<String> results = primes.factorize(6);
		
		Assert.assertEquals("2", results.get(0));
		Assert.assertEquals("3", results.get(1));	
	}
	@Test
	public void given_9_return_33(){
		List<String> results = primes.factorize(9);
		
		Assert.assertEquals("3", results.get(0));
		Assert.assertEquals("3", results.get(1));	
	}
	@Test
	public void given_10_return_25(){
		List<String> results = primes.factorize(10);
		
		Assert.assertEquals("2", results.get(0));
		Assert.assertEquals("5", results.get(1));	
	}
	@Test
	public void given_7_return_7(){
		List<String> results = primes.factorize(7);
		
		Assert.assertEquals("7", results.get(0));
	}
	@Test
	public void given_336_return_222237(){
		List<String> results = primes.factorize(336);
		
		Assert.assertEquals("2", results.get(0));
		Assert.assertEquals("2", results.get(1));
		Assert.assertEquals("2", results.get(2));
		Assert.assertEquals("2", results.get(3));
		Assert.assertEquals("3", results.get(4));
		Assert.assertEquals("7", results.get(5));
	}
	@Test
	public void given_37_return_37(){
		List<String> results = primes.factorize(37);
		
		Assert.assertEquals("37", results.get(0));
	}
}
