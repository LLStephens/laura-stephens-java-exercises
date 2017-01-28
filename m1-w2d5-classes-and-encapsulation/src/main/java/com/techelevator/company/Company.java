package com.techelevator.company;

public class Company {

	private String name;
	private int numberOfEmployees;
	private int revenue;
	private int expenses;
	
	public Company(){
		name = new String();
		numberOfEmployees = 0;
		revenue = 0;
		expenses = 0;
	}
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name != null && !name.isEmpty()){
			this.name = name;
		}
	}
	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	public void setNumberOfEmployees(int numberOfEmployees) {
		if(numberOfEmployees>0){
			this.numberOfEmployees = numberOfEmployees;
		}
	}
	public int getRevenue() {
		return revenue;
	}
	public void setRevenue(int revenue) {
		if(revenue>=0){
			this.revenue = revenue;
		}
	}
	public int getExpenses() {
		return expenses;
	}
	
	public void setExpenses(int expenses) {
		if(expenses>=0){
			this.expenses = expenses;
		}
	}
	
	public int profits(){
		return revenue - expenses;
	}

	public String companySize() {
		if(numberOfEmployees> 250){
			return "large";
		} else if (numberOfEmployees > 50){
			return "medium";
		}else if (numberOfEmployees <=50);
			return "small";
	}
	
	/*
	 
	 The Company class has the following properties
		name
		numberOfEmployees
		revenue
		expenses
	 	companySize * 
	 	profit **	 

	 Please select an appropriate data type, and write a getter and setter for each property listed above. 
	 Note, some properties may or may not require both a getter and a setter.
	 
	 Use the main method in PersonTest.java to verify the functionality of the Person class.  
	 (Please see notes in PersonTest.java for further instructions.)
	 
	  * companySize is derived (i.e. calculated), and does not need a setter. A company is "small" if less than 50 employees,
	  	"medium" if between 51 and 250 employees, "large" if greater than 250 employees.
	  	
	 ** profit is derived (i.e. calculated), and does not need a setter. Profit equals revenue minus expenses.
	 
	 */

	//
	// Write your code below
	//

}
