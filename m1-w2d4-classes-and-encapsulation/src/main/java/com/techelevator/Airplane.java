package com.techelevator;

public class Airplane {

	private String planeNumber;
    private int bookedFirstClassSeats;
    private int totalFirstClassSeats;
    private int bookedCoachSeats;
    private int totalCoachSeats;
	
	public Airplane(int totalFirstClassSeats, int totalCoachSeats){
		setTotalFirstClassSeats(totalFirstClassSeats);
		setTotalCoachSeats(totalCoachSeats);
		bookedCoachSeats = 0;
		bookedFirstClassSeats = 0;
		planeNumber = new String();
		
	}
	
	public int getTotalFirstClassSeats() {
		return totalFirstClassSeats;
	}
	
	public void setTotalFirstClassSeats(int totalFirstClassSeats) {
		if(totalFirstClassSeats > 0 ){
			this.totalFirstClassSeats = totalFirstClassSeats;
		}	
	}
	
	public int getTotalCoahSeats() {
		return totalFirstClassSeats;
	}
	
	public void setTotalCoachSeats(int totalCoachSeats) {
		if(totalCoachSeats > 0){
			this.totalCoachSeats = totalCoachSeats;
		}
	}
	
	public String planeNumber() {
		return planeNumber;
	}
	
	public void setPlaneNumber(String planeNumber) {
		if(planeNumber != null && !planeNumber.isEmpty()){
			this.planeNumber = planeNumber;
		}
	}
	public int getBookedFirstClassSeats() {
		return bookedFirstClassSeats;
	}
	
	public void setBookedFirstClassSeats(int bookedFirstClassSeats) {
		if(bookedFirstClassSeats <= totalFirstClassSeats){
			this.bookedFirstClassSeats = bookedFirstClassSeats;
		}
	}
	
	public int getBookedCoahSeats() {
		return bookedCoachSeats;
	}
	
	public void setBookedCoachSeats(int bookedCoachSeats) {
		if(bookedCoachSeats<=totalCoachSeats){
			this.bookedCoachSeats = bookedCoachSeats;
		}
	}
	
	public boolean reserveSeats(boolean firstClass, int totalNumberOfSeats){
		int remainingFirstClassSeats = totalFirstClassSeats-bookedFirstClassSeats;
		int remainingCoachSeats = totalCoachSeats-bookedCoachSeats;
		if(firstClass == true && remainingFirstClassSeats >= totalNumberOfSeats){
			remainingFirstClassSeats-=totalNumberOfSeats;
			System.out.println("Seats booked");
			return true;
		}else if(firstClass == true && remainingFirstClassSeats<totalNumberOfSeats){
			System.out.println("There are not enough first class seats. Try sitting in coach with the filthy proletariats");
			return false;
		}else if(firstClass == false && remainingCoachSeats>=totalNumberOfSeats) {
			remainingCoachSeats-=totalNumberOfSeats;
			System.out.println("Seats booked.  See you in stearage.");
			return true;
		}else {
			System.out.println("Wah, wah...Looks like you're taking the bus");
			return false;		
			
		}

	}
}