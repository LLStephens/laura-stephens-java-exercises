package com.techelevator;

public class SmartPhone {

	private String phoneNumber;
	private String carrier;
    private String operatingSystem;
    private int batteryCharge;
    private boolean onCall;
	    
	public SmartPhone(String phoneNumber){  
	    carrier = new String();
	    operatingSystem = new String();
	    batteryCharge = 0;
	    onCall = false;
	    setPhoneNumber(phoneNumber);
	}
	
	    public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			if(phoneNumber.length() == 10){
				this.phoneNumber = phoneNumber;
			}
		}
		public String getCarrier() {
			return carrier;
		}
		public void setCarrier(String carrier) {
			if(carrier != null && !carrier.isEmpty()){
				this.carrier = carrier;
			}
		}
		public String getOperatingSystem() {
			return operatingSystem;
		}
		public void setOperatingSystem(String operatingSystem) {
			if(operatingSystem !=null && !operatingSystem.isEmpty()){
				this.operatingSystem = operatingSystem;
			}
		}
		public int getBatteryCharge() {
			return batteryCharge;
		}
		public void setBatteryCharge(int batteryCharge) {
			if(batteryCharge >= 0){
				this.batteryCharge = batteryCharge;
			}
		}
		public boolean getIsOnCall() {
			return onCall;
		}
		
		public boolean call(String phoneNumberToCall){
			if(phoneNumber.length()==10){
				return true;
			} else {
				return false;
			}
		}
		
	    public void answer(){
	    	onCall=true;
	    }
	    public void hangup(){
	    	onCall=false;
	    }
	    

	
}
