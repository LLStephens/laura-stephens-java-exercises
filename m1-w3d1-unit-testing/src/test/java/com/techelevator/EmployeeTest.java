package com.techelevator;

import org.junit.Assert;
import org.junit.Before;

import org.junit.Test;

public class EmployeeTest {

	private Employee employee;


	@Before
	public void setup(){
		employee = new Employee(0, null, null, 0.00);
	}	
		
	@Test
	public void check_for_initialization(){
		Assert.assertNull("First name should be null", employee.firstName());
		Assert.assertNull("Last name should be null", employee.lastName());
		Assert.assertEquals("Salary should be zero", 0.00, employee.getAnnualSalary(), 1);
		Assert.assertEquals("Employee ID should be 0", 0, employee.getEmployeeId());
	}
	
	@Test
	public void get_both_names_for_Sue_Gleason(){
		//Act
		employee.setFirstName("Sue");
		employee.setLastName("Gleason");
		
		//Assert
		Assert.assertEquals("The employee's name is Gleason, Sue", "Gleason, Sue", employee.fullName());
	}
	
	@Test
	public void get_department_name_as_billing(){
		//Act
		employee.setDepartment("Billing");
		
		//Assert
		Assert.assertEquals("The employee's department is billing", "Billing", employee.getDepartment());
	}
	
	@Test
	public void get_employee_salary_of_50000(){
		//Act
		employee.setAnnualSalary(50000);
		
		//Assert
		Assert.assertEquals("The employee's salary is 50000",50000, employee.getAnnualSalary(), 1);
	}
	
	@Test
	public void get_employee_Id_of_54321(){
		//Act
		employee.setEmployeeId(54321);
		
		//Assert
		Assert.assertEquals("Employee ID is 54321", 54321, employee.getEmployeeId());
	}
	
	@Test
	public void compute_raised_salary_with_2percent_raise(){
		//Act
		employee.setAnnualSalary(50000);
		employee.RaiseSalary(2);
		
		//Assert
		Assert.assertEquals("The raised salary is 51000", 51000, employee.getAnnualSalary(), 0.0009);
	}
		
}