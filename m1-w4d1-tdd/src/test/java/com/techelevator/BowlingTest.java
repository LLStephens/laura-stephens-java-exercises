package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class BowlingTest {
//
//	@Test
//	public void calculatesSimpleScore(){
//		Bowling subject = new Bowling();
//		
//		for(int i = 0; i<10; i++){
//			subject.roll(1);
//			subject.roll(1);
//		}
//		
//		Assert.assertEquals(20, subject.score());
//	}
	
	
	@Test
	public void calculatesFrameScore(){
		Frame frame = new Frame();
		Bowling subject = new Bowling();
		
		subject.roll(1);
		subject.roll(1);
		
		Assert.assertEquals(2, frame.getFrameScore());
	}
	
}
