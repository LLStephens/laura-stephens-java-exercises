package com.techelevator;

public class BabySitter {

	private int start;
	private int bed;
	private int end;
	private int hours;
	private int pay;
	private int totalPay;

	public BabySitter(int start, int end, int bed) {
		this.start = start;
		this.bed = bed;
		this.end = end;
	}


	public int calcTotalPay() {
		if (start > end) {
			totalPay = 16 * end;
			end = 12;
		}
		for (int i = start; i < end; i++) {
			if (i < bed & i > 5) {
				pay = 12;
			} else if (i >= bed && i < 12) {
				pay = 8;
			} else {
				pay = 16;
			}
			totalPay += pay;
			pay = 0;
		}

		return totalPay;
	}

	public boolean starts() {
		return (start > 5) ? true : false;
	}

	public boolean leaves() {
		return (end < 4) ? true : false;
	}

}
