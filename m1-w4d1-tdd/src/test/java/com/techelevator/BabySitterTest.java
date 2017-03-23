package com.techelevator;

import org.junit.*;

public class BabySitterTest {
	
	@Test
	public void sitter_starts(){
		BabySitter sitter = new BabySitter(6, 7, 8);
		
		Assert.assertTrue(sitter.starts());
	}
	
	@Test
	public void sitter_starts_after_5pm(){
		BabySitter sitter = new BabySitter(6, 7, 8);
		
		Assert.assertTrue(sitter.starts());
	}
	
	@Test
	public void sitter_doesnt_start_before_5pm(){
		BabySitter sitter = new BabySitter(3, 7, 8);
		
		Assert.assertFalse(sitter.starts());
	}
	
	@Test
	public void sitter_doesnt_leave_after_4am(){
		BabySitter sitter = new BabySitter(6, 5, 8);
		
		Assert.assertFalse(sitter.leaves());
	}

	@Test
	public void shouldGetPaid12PerHourUntilBedtime() {
		BabySitter calc = new BabySitter(6, 7, 8);
		
		Assert.assertEquals(12, calc.calcTotalPay());
	}
	
	@Test
	public void shouldGetPaid8PerHourBetweenBedAndMidnight() {
		BabySitter calc = new BabySitter(9, 12, 8);
		Assert.assertEquals(24, calc.calcTotalPay());
	}
	
	@Test
	public void shouldGetPaid16PerHourAfterMidnight() {
		BabySitter calc = new BabySitter(1, 2, 8);
		
		Assert.assertEquals(16, calc.calcTotalPay());
	}
	
	@Test
	public void shouldGetPaid16PerHourAfterMidnightAnd8PerHourBeforeMidnightButAfterBedtime() {
		BabySitter calc = new BabySitter(11, 1, 8);
		
		Assert.assertEquals(24, calc.calcTotalPay());
	}
}
