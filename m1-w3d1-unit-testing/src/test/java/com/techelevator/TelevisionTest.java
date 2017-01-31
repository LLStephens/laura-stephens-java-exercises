package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TelevisionTest {

	private Television tv;
	
	@Before
	public void setup(){
		tv = new Television();
	}
	
	@Test
	public void tv_is_initialized_correctly(){
		//Assert
		Assert.assertFalse("After construction, the television should be off", tv.isOn());
		Assert.assertEquals("The default channel should be 3", 3, tv.getSelectedChannel());
		Assert.assertEquals("The default volume should be 0", 0, tv.getCurrentVolume());
	}
	
	@Test
	public void turn_on_tv(){
		//Act
		tv.turnOn();
		
		//Assert
		Assert.assertTrue("The tv should be on", tv.isOn());
	}
	
	@Test
	public void turn_off_tv(){
		//Arrange
		tv.turnOn();
		
		//Act
		tv.turnOff();
		
		//Assert
		Assert.assertFalse("The tv should be off", tv.isOn());
	}
	
	@Test
	public void change_channel_with_tv_on(){
		//Arrange
		tv.turnOn();
		
		//Act
		tv.changeChannel(4);
		
		//Assert
		Assert.assertEquals("The channel should set to 4", 4, tv.getSelectedChannel());
	}
	
	@Test
	public void change_to_a_channel_that_is_too_high(){
		//Arrange
		tv.turnOn();
		
		//Act
		tv.changeChannel(19);
		
		//Assert
		Assert.assertEquals("The channel should set to 3", 3, tv.getSelectedChannel());
	}
	
	@Test
	public void change_to_a_channel_that_is_too_low(){
		//Arrange
		tv.turnOn();
		
		//Act
		tv.changeChannel(2);
		
		//Assert
		Assert.assertEquals("The channel should set to 3", 3, tv.getSelectedChannel());
	}
	
	@Test
	public void change_channel_with_tv_off(){	
		//Act
		tv.changeChannel(4);
		
		//Assert
		Assert.assertEquals("The channel should not chnage when tv is off", 3, tv.getSelectedChannel());
	}
	
	@Test
	public void raise_volume(){
		//Arrange
		tv.turnOn();
		
		//Act
		for(int i = 0; i<5; i++){
			tv.raiseVolume();
		}
		
		//Assert
		Assert.assertEquals("The volume should be 5 after raising by 5", 5, tv.getCurrentVolume());
	}
	
	@Test
	public void raise_volume_with_tv_off(){
		//Act
		for(int i = 0; i<5; i++){
			tv.raiseVolume();
		}
		
		//Assert
		Assert.assertEquals("The volume should not chnage when tv is off", 0, tv.getCurrentVolume());
	}
	
	@Test
	public void raise_volume_to_11(){
		//Arrange
		tv.turnOn();
		
		//Act
		for(int i = 0; i<11; i++){
			tv.raiseVolume();
		}
		
		//Assert
		Assert.assertEquals("Volume should stop at 10", 10, tv.getCurrentVolume());
		
	}
	
	@Test
	public void lower_volume_from_1_0_with_tv_on(){
		//Arrange
		tv.turnOn();
		tv.raiseVolume();
		
		//Act
		tv.lowerVolume();
		
		//Assert 
		Assert.assertEquals("The volume should 0",0, tv.getCurrentVolume());
	}
	
	@Test
	public void lower_volume_from_1_0_with_tv_off(){
		//Arrange
		tv.raiseVolume();
		
		//Act
		tv.lowerVolume();
		
		//Assert 
		Assert.assertEquals("The volume should not change when tv is off", 0, tv.getCurrentVolume());
	}
	
	@Test
	public void volume_should_not_go_below_zero(){
		//Arrange
		tv.turnOn();
		
		//Act
		tv.lowerVolume();
		
		//Assert
		Assert.assertEquals("Volume should not go below zero", 0, tv.getCurrentVolume());
	}
}
