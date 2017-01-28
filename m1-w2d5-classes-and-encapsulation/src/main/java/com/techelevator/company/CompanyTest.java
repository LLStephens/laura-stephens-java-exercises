package com.techelevator.company;

public class CompanyTest {

	public static void main(String[] args) {
		
		// write code here that verifies the functionality of the Company class
		boolean allTestsPassed = true;
		
		Company company = new Company();
	
		//Expenses
		if(company.getExpenses() !=0){
			allTestsPassed=false;
			System.out.println("Test FAILED: The result should start at zero when a Company is created using the no-arg constructor.");
		}
		
		company.setExpenses(1000);
		if(company.getExpenses() !=1000){
			allTestsPassed=false;
			System.out.println("Test FAILED: The returned result should be 1000 after setting the expenses to 1000 but it was " + company.getExpenses());
		}
		
		company.setExpenses(-1);
		if(company.getExpenses() !=1000){
			allTestsPassed=false;
			System.out.println("Test FAILED: The returned result should be 1000 after setting the expenses to 1000 but it was " + company.getExpenses());
		}
		//Revenue
		if(company.getRevenue() !=0){
			allTestsPassed=false;
			System.out.println("Test FAILED: The result should start at zero when a Company is created using the no-arg constructor.");
		}
		
		company.setRevenue(20000);
		if(company.getRevenue() !=20000){
			allTestsPassed=false;
			System.out.println("Test FAILED: The returned result should be 20000 after setting the revenue to 20000 but it was " + company.getRevenue());
		}
		
		company.setRevenue(10000);
		if(company.getRevenue() !=10000){
			allTestsPassed=false;
			System.out.println("Test FAILED: The returned result should be 10000 after setting the revenue to 10000 but it was " + company.getRevenue());
		}
		
		company.setRevenue(-1);
		if(company.getRevenue() !=10000){
			allTestsPassed=false;
			System.out.println("Test FAILED: The returned result should be 10000 after setting the revenue to 10000 but it was " + company.getRevenue());
		}
		//Profits method
		int results = company.profits();
		if(results != 9000){
			allTestsPassed=false;
			System.out.println("Test FAILED: The returned result should be 9000 but it was " + results);
		}
		
		//Number of Employees
		if(company.getNumberOfEmployees() !=0){
			allTestsPassed=false;
			System.out.println("Test FAILED: The result should start at zero when a Company is created using the no-arg constructor.");
		}
		
		company.setNumberOfEmployees(100);
		if(company.getNumberOfEmployees() !=100){
			allTestsPassed=false;
			System.out.println("Test FAILED: The returned result should be 100 after setting the number of employees to 100 but it was " + company.getNumberOfEmployees());
		}
		
		company.setNumberOfEmployees(-1);
		if(company.getNumberOfEmployees() !=100){
			allTestsPassed=false;
			System.out.println("Test FAILED: The returned result should be 100 after setting the number of employees to 100 but it was " + company.getNumberOfEmployees());
		}
		//Company Size method
		String result = company.companySize();
		if(!result.equals("medium")){
			allTestsPassed=false;
			System.out.println("Test FAILED: The returned result should be medium after setting the number of employees to 100 but it was " + result);
		}
		company.setNumberOfEmployees(255);
		result = company.companySize();
		if(!result.equals("large")){
			allTestsPassed=false;
			System.out.println("Test FAILED: The returned result should be large after setting the number of employees to 250 but it was " + result);
		}
		company.setNumberOfEmployees(5);
		result = company.companySize();
		if(!result.equals("small")){
			allTestsPassed=false;
			System.out.println("Test FAILED: The returned result should be large after setting the number of employees to 5 but it was " + result);
		}
		//Name
		
		company.setName("Sue");
		if(!company.getName().equals("Sue")){
			allTestsPassed=false;
			System.out.println("Test FAILED: The returned result should be Sue but it was " + company.getName());
		}
		
		company.setName("Joan");
		if(!company.getName().equals("Joan")){
			allTestsPassed=false;
			System.out.println("Test FAILED: The returned result should be Joan but it was " + company.getName());
		}
		
		company.setName("");
		if(!company.getName().equals("Joan")){
			allTestsPassed=false;
			System.out.println("Test FAILED: The returned result should be Joan but it was " + company.getName());
		}
		
		
		
//		ALL TEST PASSED 
		if(allTestsPassed) {
			System.out.println("All tests PASSED!");
		}
	}

}
