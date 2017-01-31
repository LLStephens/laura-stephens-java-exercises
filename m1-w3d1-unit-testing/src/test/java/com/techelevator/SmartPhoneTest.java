package com.techelevator;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class SmartPhoneTest {
	
	private SmartPhone phone;

	@Before
	public void setup(){
		phone = new SmartPhone("123456789", "Sprint");
	}
	
	@Test
	public void get_number_for_123456789(){
		//Assert
		Assert.assertEquals("The phone number is 123456789", "123456789", phone.getPhoneNumber());
	}
	
	@Test
	public void get_carrier_as_Sprint(){
		//Assert
		Assert.assertEquals("The carrier is Sprint", "Sprint", phone.getCarrier());
	}
	
	@Test
	public void get_operating_system_of_OS(){
		//Act
		phone.setOperatingSystem("OS");
		
		//Assert
		Assert.assertEquals("The operating system is OS", "OS", phone.getOperatingSystem());
	}
	
	@Test
	public void get_default_value_of_battery(){
		//Assert
		Assert.assertEquals("The default battery level is 100", 100, phone.getBatteryCharge());
	}
	
	@Test
	public void get_battery_level_at_60(){
		//Act
		phone.setBatteryCharge(60);
		
		//Assert
		Assert.assertEquals("The battery level is 60", 60, phone.getBatteryCharge());
	}
	
	@Test
	public void battery_level_too_high(){
		//Act
		phone.setBatteryCharge(30);
		phone.setBatteryCharge(190);
		
		//Assert
		Assert.assertEquals("The battery level is at 30", 30, phone.getBatteryCharge());
	}
	@Test
	public void battery_level_too_low(){
		//Act
		phone.setBatteryCharge(30);
		phone.setBatteryCharge(-10);
		
		//Assert
		Assert.assertEquals("The battery level is at 30", 30, phone.getBatteryCharge());
	}
	
	@Test
	public void makes_phone_call(){
		//Act
		phone.setBatteryCharge(90);
		phone.call("123456789", 20);
		
		//Assert
		Assert.assertTrue("The phone call is active", phone.isOnCall());
		Assert.assertEquals("The battery level is now 70", 70, phone.getBatteryCharge());
	}
	
	@Test
	public void makes_phone_call_with_too_few_mins(){
		//Act
		phone.setBatteryCharge(4);
		phone.call("123456789", 80);
		
		//Assert
		Assert.assertFalse("The phone does not have enough power to talk for 80 minutes", phone.isOnCall());
		Assert.assertEquals("The battery level is 4", 4, phone.getBatteryCharge());
		
	}
	
	@Test
	public void answer_phone_to_turn_call_on(){
		//Act
		phone.answerPhone();
		
		//Assert
		Assert.assertTrue("The phone call is active", phone.isOnCall());
	}
	
	@Test
	public void hang_up_to_turn_call_off(){
		//Act
		phone.hangUp();
		
		//Assert
		Assert.assertFalse("The phone call is not active", phone.isOnCall());
	}
	
	@Test
	public void recharge_back_to_100(){
		//Act
		phone.setBatteryCharge(30);
		phone.rechargeBattery();
		
		//Assert
		Assert.assertEquals("The battery is fully charged to 100", 100, phone.getBatteryCharge());
	}
	
}