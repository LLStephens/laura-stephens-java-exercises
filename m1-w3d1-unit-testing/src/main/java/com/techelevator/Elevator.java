package com.techelevator;

public class Elevator {

	private int shaftNumber;
    private int currentLevel;
    private int numberOfLevels;
    private boolean doorOpen = true;
    private boolean moving;

    /**
     * Creates a new elevator 
     * @param shaftNumber Shaft for the elevator
     * @param totalNumberOfFloors Number of floors in the elevator
     */
    public Elevator(int shaftNumber, int totalNumberOfFloors) {
        this.shaftNumber = shaftNumber;
        this.numberOfLevels = totalNumberOfFloors;
        this.currentLevel = 1;
    }

    /**
     * Elevator Shaft Number 
     * @return shaftNumber
     */
    public int getShaftNumber() {
        return shaftNumber;
    }

    /**
     * Current elevator level 
     * @return currentLevel
     */
    public int getCurrentLevel() {
        return currentLevel;
    }

    /**
     * Number of levels available for elevator. 
     * @return numberOfLevels
     */
    public int getNumberOfLevels() {
        return numberOfLevels;
    }

    /**
     * Is Elevator Door Open? 
     * @return doorOpen
     */
    public boolean isDoorOpen() {
        return doorOpen;
    }

    /**
     * Is elevator door moving 
     * @return moving
     */
    public boolean isMoving() {
        return moving;
    }
    
    public void setIsMoving(boolean moving){
    	this.moving=moving;
    }

    /**
     * Opens the elevator door, as long as it is not moving 
     */
    public void openDoor(){
        if (!moving){
        	doorOpen = true;
        } else {
        	doorOpen = false;
        }
    }

    /**
     * Closes the elevator door, as long as it is not moving. 
     */
    public void closeDoor()
    {
    	doorOpen = false;
      
    }
    
    public void setCurrentLevel(int currentLevel){
    	this.currentLevel = currentLevel;
    }

 
    /**
     * Moves the elevator up, as long as the door is closed and the desired floor is not past the last floor 
     * @param desiredFloor Desired floor to go to
     * @return If the elevator was able to move up
     */
    public boolean goUp(int desiredFloor)
    {
        if (desiredFloor > currentLevel && desiredFloor <= numberOfLevels && doorOpen==false)
        {
        	currentLevel = desiredFloor;
            return true;
        	
        }  else{
        return false;
        }
    }

    /**
     * Moves the elevator down, as long as the door is closed and desired floor is lower than current but not past 1 
     * @param desiredFloor Floor to go to
     * @return True if possible to move
     */
    public boolean goDown(int desiredFloor)
    {
        if (desiredFloor < currentLevel && desiredFloor > 0 && doorOpen==false)
        {
            currentLevel = desiredFloor;
            return true;
        }
        return false;
    }

}
