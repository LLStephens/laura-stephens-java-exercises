package com.techelevator.person;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	
	public Person(){
		firstName = new String();
		lastName= new String();
		age = 0;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if(firstName != null && !firstName.isEmpty()){
			this.firstName = firstName;
		}
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if(lastName != null && !lastName.isEmpty()){
			this.lastName = lastName;
		}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age>0){
			this.age = age;
		}
	}
	
	public String fullName(){
		return firstName + " " +lastName;
	}
	
	public boolean adult(){
		if(age>=18){
			return true;
		} else {
			return false;
		}
	}
	
	/*
	 
	 The Person class has the following properties
	 	firstName
		lastName
		fullName * 
		age
	 	adult **
	 
	 Please select an appropriate data type, and write a getter and setter for each property listed above. 
	 Note, some properties may or may not require both a getter and a setter.
	 
	 Use the main method in PersonTest.java to verify the functionality of the Person class.  
	 (Please see notes in PersonTest.java for further instructions.)
	 
	  * fullName is derived (i.e. calculated), and does not need a setter.
	  
	 ** adult is derived (i.e. calculated), and does not need a setter. Any person whose age is 18 or greater is an adult.
	 
	 */

	//
	// Write your code below
	//

}
