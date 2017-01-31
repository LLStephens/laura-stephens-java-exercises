package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class AirplaneTest {

	private Airplane plane;
	
	@Before
	public void setup(){
		plane = new Airplane(10, 25);
	}
	
	@Test
	public void plane_is_initialized_correctly(){
		Assert.assertEquals("The default number of booked coach seats is zero", 0, plane.getBookedCoachSeats());
		Assert.assertEquals("The default number of booked first class seats is zero", 0, plane.getBookedFirstClassSeats());
		Assert.assertEquals("The default plane number is zero", null, plane.getPlaneNumber());
	}
	
	@Test
	public void get_total_of_firstclass_seats_returns_10(){
		//Act
		int firstClassSeats = plane.getTotalFirstClassSeats();
		
		//Assert
		Assert.assertEquals("The total number of first class seats should be 10", 10, firstClassSeats);
	}
	
	@Test
	public void get_total_of_coach_seats_returns_25(){
		//Act
		int coachSeats = plane.getTotalCoachSeats();
		
		//Assert
		Assert.assertEquals("The total number of coach seats should be 25", 25, coachSeats);
	}
	
	@Test
	public void get_number_of_avail_coach_seats_after_booking(){
		//Act
		plane.reserve(false, 10);
		
		//Assert
		Assert.assertEquals("After booking 10 coach seats, 15 should remain", 15, plane.getAvailableCoachSeats());
	}
	
	@Test
	public void get_number_of_booked_coach_seats_after_booking(){
	
		//Act
		plane.reserve(false, 15);
		int bookedCoachSeats = plane.getBookedCoachSeats();
		
		//Assert
		Assert.assertEquals("The number of booked coach seats should be 15",15 , bookedCoachSeats);
	}
	
	@Test
	public void get_number_of_booked_first_class_seats_after_booking(){
		//Act
		plane.reserve(true, 5);
		
		//Assert
		Assert.assertEquals("The number of booked first class seats is 5",  5, plane.getBookedFirstClassSeats());
		
	}
	
	@Test
	public void get_available_first_class_seats_after_booking(){
		//Act
		plane.reserve(true, 4);
		
		//Assert
		Assert.assertEquals("There should be 6 first class seats available after booking 4 seats", 6, plane.getAvailableFirstClassSeats());
	}
	
	@Test
	public void get_booked_coach_seats_if_request_too_many(){
		//Act
		plane.reserve(false, 20);
		plane.reserve(false,10);
		
		//Assert
		Assert.assertEquals("The number of booked seats should be 20", 20, plane.getBookedCoachSeats());
		
	}
	
	@Test
	public void get_booked_first_class_seats_if_request_too_many(){
		//Act
		plane.reserve(true, 6);
		plane.reserve(true,7);
		
		//Assert
		Assert.assertEquals("The number of booked seats should be 6", 6, plane.getBookedFirstClassSeats());
		
	}
	
	
	
	@Test
	public void get_plane_number_that_is_too_short(){
		//Act
		plane.setPlaneNumer("12345");
		
		//Assert
		Assert.assertNull("The plane number cannot be set if less than 6 characters", plane.getPlaneNumber());
	}
	
	@Test 
	public void get_plane_number_that_is_too_long(){
		//Act
		plane.setPlaneNumer("1234567");
		
		//Assert
		Assert.assertNull("The plane number cannot be set if more than 6 characters", plane.getPlaneNumber());
	}
	
	@Test
	public void get_plane_number(){
		//Act
		plane.setPlaneNumer("123456");
		
		//Assert
		Assert.assertEquals("The plane number is 123456", "123456", plane.getPlaneNumber());
	}
}
