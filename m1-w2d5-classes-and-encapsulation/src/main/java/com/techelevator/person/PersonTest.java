package com.techelevator.person;

public class PersonTest {

	public static void main(String[] args) {
		
	boolean allTestsPassed=true;
	
	Person person = new Person();
	
	//First name
	
	person.setFirstName("Sue");
	person.setFirstName("Sue");
	if(!person.getFirstName().equals("Sue")){
		allTestsPassed=false;
		System.out.println("Test FAILED: The returned result should be Sue but it was " + person.getFirstName());
	}
	
	person.setFirstName("Joan");
	if(!person.getFirstName().equals("Joan")){
		allTestsPassed=false;
		System.out.println("Test FAILED: The returned result should be Joan but it was " + person.getFirstName());
	}
	
	person.setFirstName("");
	if(!person.getFirstName().equals("Joan")){
		allTestsPassed=false;
		System.out.println("Test FAILED: The returned result should be Joan but it was " + person.getFirstName());
	}
	
	//Last name

	person.setLastName("Wu");
	if(!person.getLastName().equals("Wu")){
		allTestsPassed=false;
		System.out.println("Test FAILED: The returned result should be Wu but it was " + person.getLastName());
	}
	
	person.setLastName("Joyner");
	if(!person.getLastName().equals("Joyner")){
		allTestsPassed=false;
		System.out.println("Test FAILED: The returned result should be Joyner but it was " + person.getLastName());
	}
	
	person.setLastName("");
	if(!person.getLastName().equals("Joyner")){
		allTestsPassed=false;
		System.out.println("Test FAILED: The returned result should be Joyner but it was " + person.getLastName());
	}
	
	//age
	person.setAge(27);
	if(person.getAge() !=27){
		allTestsPassed=false;
		System.out.println("Test FAILED: The returned result should be 27 but it was " + person.getAge());
	}
	
	person.setAge(29);
	if(person.getAge() !=29){
		allTestsPassed=false;
		System.out.println("Test FAILED: The returned result should be 29 but it was " + person.getAge());
	}
	
	person.setAge(0);
	if(person.getAge() !=29){
		allTestsPassed=false;
		System.out.println("Test FAILED: The returned result should be 29 but it was " + person.getAge());
	}
	
	//Full name
	if(!person.fullName().equals("Joan Joyner")){
		allTestsPassed=false;
		System.out.println("Test FAILED: The returned result should be Joan Joyner but it was " + person.fullName());
	}
	
	person.setFirstName("Thomas");
	person.setLastName("Jefferson");
	if(!person.fullName().equals("Thomas Jefferson")){
		allTestsPassed=false;
		System.out.println("Test FAILED: The returned result should be Thomas Jefferson but it was " + person.fullName());
	}
	
	//Adult
	if(person.adult() == false){
		allTestsPassed=false;
		System.out.println("Test FAILED: The returned result should be true, the person is an adult (age 29) but it was " + person.adult());
	}
	
	person.setAge(10);
	if(person.adult() == true){
		allTestsPassed=false;
		System.out.println("Test FAILED: The returned result should be false, the person is not an adult (age 10) but it was " + person.adult());
	}
	
	
	
	
	
//	ALL TEST PASSED 
	if(allTestsPassed) {
		System.out.println("All tests PASSED!");
	}
}

}
