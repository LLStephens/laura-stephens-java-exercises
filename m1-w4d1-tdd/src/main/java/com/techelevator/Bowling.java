package com.techelevator;

public class Bowling {
	private static int score;
	private Frame[] frames = new Frame[10];
	private int currentFrame = 0;
	

	
	public int roll(int pins){
		frames[currentFrame].setFrameScore(pins);
		return score += pins;
	}
	
	public int score(){
		return score;
	}
	

	
	
}
