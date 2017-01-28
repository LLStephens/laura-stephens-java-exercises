package com.techelevator;

public class Television {

	private boolean isOn;       
    private int selectedChannel;
    private int currentVolume;
    
    public Television(){
	    isOn = false;       
	    selectedChannel = 0;
	    currentVolume = 0;
    }

	public boolean getIsOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	public int getSelectedChannel() {
		return selectedChannel;
	}

	public void setSelectedChannel(int selectedChannel) {
		if(selectedChannel >0){
			this.selectedChannel = selectedChannel;
		}
	}

	public int getCurrentVolume() {
		return currentVolume;
	}

	public void setCurrentVolume(int currentVolume) {
		if(currentVolume<10){
			this.currentVolume = currentVolume;
		}
	}
    

    public void turnOn(){
    	isOn = true;
    	currentVolume=2;
    	selectedChannel=3;
    }
    public void changeChannel(int newChannel){
    	selectedChannel= newChannel;
    }
    public void raiseVolume() {
    	if(currentVolume < 10){
    		currentVolume = currentVolume +1;
    	} 
    }
    public void lowerVolume() {
    	if(currentVolume > 0){
    		currentVolume--;
    	}
    }
	    
	    
	    
	    
}
