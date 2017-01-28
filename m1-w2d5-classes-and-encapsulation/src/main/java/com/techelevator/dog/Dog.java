package com.techelevator.dog;

/**
 * This class represents a dog that can sleep, wake, and make a sound, so it's pretty much like most dogs,
 * with a few essential methods missing. Thankfully.
 */
public class Dog {

	private String sound;
	private boolean isSleeping;


	public Dog() {
		sound = "woof!";
		isSleeping = false;
	}
	//
	// Add any properties, along with getters and/or setters, that may be needed to implements the class methods and/or constructors.
	//
	
	public String getSound(){
		return sound;
	}
	
	public void setSound(String sound){
		if(sound != null && !sound.isEmpty()){
			this.sound=sound;
		}
	}
	
	/**
	 * @return "woof!" if the dog is awake, otherwise "Zzzz..."
	 */
	public String makeSound() {
		if(isSleeping){
			return "Zzzz...";
		} else {
			return sound;
		}
	}
	
	/**
	 * Puts the dog to sleep
	 */
	public void sleep() {
		isSleeping=true;
	}
	
	/**
	 * Wakes the dog up
	 */
	public void wakeUp() {
		if(isSleeping){
			isSleeping = false;
		}
	}
	
	/**
	 * @return true if the dog is sleeping, otherwise false
	 */
	public boolean isSleeping() {
		if(isSleeping = true){
			return true;
		}else{
			return false;
		}
	}
}
