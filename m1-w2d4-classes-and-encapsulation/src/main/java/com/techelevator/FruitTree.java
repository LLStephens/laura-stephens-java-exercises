package com.techelevator;

public class FruitTree {

	private String fruitType;
	private int piecesOfFruitLeft;
	
	public FruitTree(){
		fruitType = new String();
		piecesOfFruitLeft = 10;
	}
	
	public String getFruitType() {
		return fruitType;
	}
	
	public void setFruitType(String fruitType) {
		if(fruitType != null && !fruitType.isEmpty()){
			this.fruitType = fruitType;
		}
	}
	
	public int getPiecesOfFruitLeft() {
		return piecesOfFruitLeft;
	}
	
	public void setPiecesOfFruitLeft(int piecesOfFruitLeft) {
		if(piecesOfFruitLeft >0){
			this.piecesOfFruitLeft = piecesOfFruitLeft;
		}
	}
	
	public boolean pickFruit(int numberOfPieces) {
		if(numberOfPieces > piecesOfFruitLeft){	
			System.out.println("There is no remaining fruit");
			return false;
		} else {
			piecesOfFruitLeft-=numberOfPieces;
			System.out.println("The " + fruitType + " tree contains " + piecesOfFruitLeft + " fruit");
			return true;
		}
		
	}
}
