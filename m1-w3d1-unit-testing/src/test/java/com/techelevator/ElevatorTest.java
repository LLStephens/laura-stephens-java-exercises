package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;



public class ElevatorTest {
	
	private Elevator elevator;
	
	@Before
	public void setup(){
		elevator = new Elevator(3, 10);
	}
	
	@Test
	public void does_elevator_intialize_correctly(){
		//Assert
		Assert.assertEquals("The shaft number is 3", 3, elevator.getShaftNumber());
		Assert.assertEquals("The number of floors is 10",10, elevator.getNumberOfLevels());
		Assert.assertTrue("The door is open by default", elevator.isDoorOpen());
		Assert.assertEquals("The elevator starts at floor 1", 1, elevator.getCurrentLevel());
	}
	
	@Test
	public void elevator_not_moving(){
		//Act
		elevator.setIsMoving(false);
		
		//Assert
		Assert.assertFalse("The elevator should not be moving", elevator.isMoving());
	}

	@Test
	public void door_opens_when_not_moving(){
		//Act
		elevator.setIsMoving(false);
		elevator.openDoor();
		
		//Assert
		Assert.assertTrue("The elevator door should open", elevator.isDoorOpen());
	}
	
	@Test
	public void door_opens_when_is_moving(){
		//Act
		elevator.setIsMoving(true);
		elevator.openDoor();
		
		//Assert
		Assert.assertFalse("The elevator door should not open when moving", elevator.isDoorOpen());
	}
	
	@Test
	public void door_closes(){
		//Act
		elevator.closeDoor();
		
		//Assert
		Assert.assertFalse("The elevator door should close", elevator.isDoorOpen());
	}
	
	
	@Test
	public void elevator_higher_than_desired_floor(){
		//Act
		elevator.setCurrentLevel(5);
		elevator.goUp(4);
		
		//Assert
		Assert.assertEquals("The elevator is at level 5", 5, elevator.getCurrentLevel());
	}
	@Test
	public void elevlator_goes_up_passed_top_floors(){
		//Act
		elevator.setCurrentLevel(8);
		elevator.goUp(11);
		
		//Assert
		Assert.assertEquals("The current floor should be 8", 8, elevator.getCurrentLevel());
	}
	
	
	@Test
	public void elevlator_goes_up_when_more_floors(){
		//Act
		elevator.closeDoor();
//		elevator.setCurrentLevel(2);
		elevator.goUp(8);
		
		//Assert
		Assert.assertEquals("The elevator should be at level 8", 8, elevator.getCurrentLevel());	
		
	}
	
	@Test
	public void elevlator_goes_up_when_door_open(){
		//Act
		elevator.openDoor();
		elevator.goUp(8);
		
		//Assert
		Assert.assertEquals("The current level is 1",1, elevator.getCurrentLevel());
	}
	
	
	@Test
	public void elevlator_goes_down_when_more_floors(){
		//Act
		elevator.closeDoor();
		elevator.setCurrentLevel(5);
		elevator.goDown(2);
		
		//Assert
		Assert.assertEquals("The elevator should be at level 2", 2, elevator.getCurrentLevel());
	}
	
	@Test
	public void elevlator_goes_down_when_no_more_floors(){
		//Act
		elevator.closeDoor();
		elevator.goDown(2);
		
		//Assert
		Assert.assertEquals("The elevator should be at level 1, cannot go down", 1, elevator.getCurrentLevel());
	}
	
	
	@Test
	public void elevlator_goes_down_when_door_open(){
		//Act
		elevator.openDoor();
		elevator.setCurrentLevel(5);
		elevator.goDown(2);
		
		//Assert
		Assert.assertEquals("The current level is 5",  5, elevator.getCurrentLevel());
	}
	@Test
	public void elevlator_goes_down_to_negative_floors(){
		//Act
		elevator.goDown(-1);
		
		//Assert
		Assert.assertEquals("The current level is 1", 1, elevator.getCurrentLevel());
	}
}
