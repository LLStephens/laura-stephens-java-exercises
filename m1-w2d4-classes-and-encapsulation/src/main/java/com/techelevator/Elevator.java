package com.techelevator;

public class Elevator {

	private int shaftNumber;
    private int currentLevel;
    private int numberOfLevels;
    private boolean doorOpen;
    private boolean isMoving;
    
    Elevator(int numberOfLevels){
	    shaftNumber = 0;
	    currentLevel = 0;
	    doorOpen = false;
	    isMoving = false;
	    setNumberOfLevels(numberOfLevels);
    }
    
    public int getNumberOfLevels() {
		return numberOfLevels;
	}

	public void setNumberOfLevels(int numberOfLevels) {
		if(numberOfLevels > 0){
			this.numberOfLevels = numberOfLevels;
		}
	}
	
	public int getShaftNumber() {
		return shaftNumber;
	}
	
	public void setShaftNumber(int shaftNumber) {
		if(shaftNumber>0){
			this.shaftNumber = shaftNumber;
		}
	}

	public int getCurrentLevel() {
		return currentLevel;
	}
	
	public void setCurrentLevel(int currentLevel) {
		if(currentLevel >0 && currentLevel<= numberOfLevels){
			this.currentLevel = currentLevel;
		}
	}

	public boolean getIsDoorOpen() {
		return doorOpen;
	}

	public void setDoorOpen(boolean doorOpen) {
			this.doorOpen = doorOpen;
	}

	public boolean getIsMoving() {
		return isMoving;
	}

	public void setMoving(boolean isMoving) {
		this.isMoving = isMoving;
	}

	public void openDoor(){
		if(isMoving = false){
			doorOpen = true;
		}
	}
	
    public void closeDoor(){
		doorOpen = false;
	}
    
    public boolean goUp(int desiredFloor) {
    	if(desiredFloor > currentLevel && desiredFloor <= numberOfLevels){
    		if(doorOpen == false){
    			System.out.println("Going up");
    			currentLevel=desiredFloor;return true;
    		}else {
    			closeDoor();
    			System.out.println("Door closing. Going up");
    			currentLevel=desiredFloor;
    			return true;
    		}
    	} else {
    		System.out.println("I think you really want to go down, not up.");
    		return false;
    	}
	}
    
    public boolean goDown(int desiredFloor) {
    	if(desiredFloor< currentLevel && desiredFloor > 0){
    		if(doorOpen == false){
    			System.out.println("Going down");
    			currentLevel=desiredFloor;
    			return true;
    		}else {
    			closeDoor();
    			System.out.println("Door closing. Going down");
    			currentLevel=desiredFloor;
    			return true;
    		}

    	} else {
    		System.out.println("I think you really want to go up, not down.");
    		return false;
    	}
    }
	
}
