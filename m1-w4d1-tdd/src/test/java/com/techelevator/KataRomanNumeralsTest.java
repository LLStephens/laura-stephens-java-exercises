package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.List;

public class KataRomanNumeralsTest {
	
	public KataRomanNumerals numerals;
	
	@Before
	public void setup(){
		numerals = new KataRomanNumerals();
	}
	
	
	@Test
	public void given_1_return_I(){
		Assert.assertEquals("I", numerals.convert(1));
	}
	@Test
	public void given_5_return_V(){
		Assert.assertEquals("V", numerals.convert(5));
	}
	@Test	
	public void given_3_return_III(){
		Assert.assertEquals("III", numerals.convert(3));
	}
	@Test
	public void given_6_return_VI(){
		Assert.assertEquals("VI", numerals.convert(6));
	}

	@Test
	public void given_1923_return_MCMXXIII(){
		Assert.assertEquals("MCMXXIII", numerals.convert(1923));
	}
	@Test
	public void given_2008_return_MMVIII(){
		Assert.assertEquals("MMVIII", numerals.convert(2008));
	}
	
//	@Test
//	public void given_1000_return_M(){
//		List <String> results = numerals.convert(1000);
//		
//		Assert.assertEquals("M", results.get(0));
//	}
//	@Test
//	public void given_2000_return_M(){
//		List <String> results = numerals.convert(2000);
//		
//		Assert.assertEquals(2, results.size());
//		Assert.assertEquals("M", results.get(0));
//		Assert.assertEquals("M", results.get(1));
//	}
//	
}
