package com.techelevator;

public class Employee {

 	private String employeeId;
    private String name;
    private String department;
    private double annualSalary;
	
	public Employee() {
		name = new String();
		employeeId = new String();
		department = new String();
		annualSalary = 0;
	}
		
	public String getEmployeeId(){
		return employeeId;
	}
	
	public void setEmployeeId(String employeeId) {
		if(employeeId != null & !employeeId.isEmpty()){
			this.employeeId = employeeId;
		}
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name) {
		if(name != null & !name.isEmpty()){
			this.name = name;
		}
	}
	
	public String getDepartment(){
		return department;
	}
	
	public void setDepartment(String department) {
		if(department != null & !department.isEmpty()){
			this.department = department;
		}
	}
	
	public double getAnnualSalary(){
		return annualSalary;
	}
	
	public void setAnnualSalary(double annualSalary) {
		if(annualSalary>0){
			this.annualSalary = annualSalary;
		}
	}
	
	public void raiseSalary(int percent) {
		annualSalary=annualSalary* (double)percent;
	}
	
	
	
}
