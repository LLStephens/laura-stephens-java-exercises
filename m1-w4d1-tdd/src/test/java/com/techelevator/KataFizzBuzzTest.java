package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class KataFizzBuzzTest {

	private KataFizzBuzz num;
	List<String> fizzBuzz = new ArrayList<String>();
	
	
	@Before
	public void setup(){
		num = new KataFizzBuzz();
		
	}
	
	@Test
	public void given_1_return_1(){
		fizzBuzz = num.convert(1);
		
		Assert.assertEquals("1", fizzBuzz.get(0));
	}
	@Test
	public void given_3_return_fizz(){
		fizzBuzz = num.convert(3);
		
		Assert.assertEquals("Fizz", fizzBuzz.get(0));
	}
	@Test
	public void given_5_return_Buzz(){
		fizzBuzz = num.convert(5);
		
		Assert.assertEquals("Buzz", fizzBuzz.get(0));
	}
	@Test
	public void given_15_return_FizzBuzz(){
		fizzBuzz = num.convert(15);
		
		Assert.assertEquals("FizzBuzz", fizzBuzz.get(0));
	}
	@Test
	public void given_39_return_Fizz(){
		fizzBuzz = num.convert(39);
		
		Assert.assertEquals("Fizz", fizzBuzz.get(0));
	}
	@Test
	public void given_0_return_blank(){
		fizzBuzz = num.convert(0);
		
		Assert.assertEquals(" ", fizzBuzz.get(0));
	}
	@Test
	public void given_101_return_blank(){
		fizzBuzz = num.convert(101);
		
		Assert.assertEquals(" ", fizzBuzz.get(0));
	}
	@Test
	public void given_35_return_FizzBuzz(){
		fizzBuzz = num.convert(35);
		
		Assert.assertEquals("Fizz", fizzBuzz.get(0));
	}
}
