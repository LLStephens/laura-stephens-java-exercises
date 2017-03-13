Feature: Alien Age Calculator

Scenario: Test Martian Age
	Given I am on the age calculator input page
	And I select the planet Mars
	And I enter a age of 100 years
	When I submit the age calculator form
	Then the calculated age is 53.13 years

Scenario: Test Jupiter Age
	Given I am on the age calculator input page
	And I select the planet Jupiter
	And I enter a age of 100 years
	When I submit the age calculator form
	Then the calculated age is 8.43 years
	
Scenario: Test Mercury Age
	Given I am on the age calculator input page
	And I select the planet Mercury
	And I enter a age of 100 years
	When I submit the age calculator form
	Then the calculated age is 414.96 years
	
Scenario: Test Venus Age
	Given I am on the age calculator input page
	And I select the planet Venus
	And I enter a age of 100 years
	When I submit the age calculator form
	Then the calculated age is 162.45 years
	
Scenario: Test Saturn Age
	Given I am on the age calculator input page
	And I select the planet Saturn
	And I enter a age of 100 years
	When I submit the age calculator form
	Then the calculated age is 3.39 years
	
Scenario: Test Neptune Age
	Given I am on the age calculator input page
	And I select the planet Neptune
	And I enter a age of 100 years
	When I submit the age calculator form
	Then the calculated age is 0.61 years
	
Scenario: Test Uranus Age
	Given I am on the age calculator input page
	And I select the planet Uranus
	And I enter a age of 100 years
	When I submit the age calculator form
	Then the calculated age is 1.19 years
	