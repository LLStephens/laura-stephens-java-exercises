Feature: Alien Travel Calculator

Scenario: Test Martian Travel
	Given I am on the travel calculator input page
	And I pick the planet Mars
	And I pick the mode Walking
	And I enter an age of 100 years
	When I submit the travel calculator form
	Then the calculated age is 2,267 years

Scenario: Test Jupiter Travel
	Given I am on the travel calculator input page
	And I pick the planet Jupiter
	And I pick the mode Walking
	And I enter an age of 100 years old
	When I submit the travel calculator form
	Then the calculated age is 14,965 years old
	
Scenario: Test Mercury Travel
	Given I am on the travel calculator input page
	And I pick the planet Mercury
	And I pick the mode Walking
	And I enter an age of 100 years old
	When I submit the travel calculator form
	Then the calculated age is 2,267 years old
	
Scenario: Test Venus Travel
	Given I am on the travel calculator input page
	And I pick the planet Venus
	And I pick the mode Walking
	And I enter an age of 100 years old
	When I submit the travel calculator form
	Then the calculated age is 1,078 years old
	
Scenario: Test Saturn Travel
	Given I am on the travel calculator input page
	And I pick the planet Saturn
	And I pick the mode Walking
	And I enter an age of 100 years old
	When I submit the travel calculator form
	Then the calculated age is 30,246 years old
	
Scenario: Test Neptune Travel
	Given I am on the travel calculator input page
	And I pick the planet Neptune
	And I pick the mode Walking
	And I enter an age of 100 years old
	When I submit the travel calculator form
	Then the calculated age is 102,990 years old
	
Scenario: Test Uranus Travel
	Given I am on the travel calculator input page
	And I pick the planet Uranus
	And I pick the mode Walking
	And I enter an age of 100 years old
	When I submit the travel calculator form
	Then the calculated age is 64,508 years old
	