Feature: Alien Weight Calculator

Scenario: Test Martian Weight
	Given I am on the weight calculator input page
	And I choose the planet Mars
	And I enter a weight of 100 pounds
	When I submit the weight calculator form
	Then the calculated weight is 38 pounds

Scenario: Test Jupiter Weight
	Given I am on the weight calculator input page
	And I choose the planet Jupiter
	And I enter a weight of 100 pounds
	When I submit the weight calculator form
	Then the calculated weight is 265 pounds
	
Scenario: Test Mercury Weight
	Given I am on the weight calculator input page
	And I choose the planet Mercury
	And I enter a weight of 100 pounds
	When I submit the weight calculator form
	Then the calculated weight is 37 pounds
	
Scenario: Test Venus Weight
	Given I am on the weight calculator input page
	And I choose the planet Venus
	And I enter a weight of 100 pounds
	When I submit the weight calculator form
	Then the calculated weight is 90 pounds
	
Scenario: Test Saturn Weight
	Given I am on the weight calculator input page
	And I choose the planet Saturn
	And I enter a weight of 100 pounds
	When I submit the weight calculator form
	Then the calculated weight is 113 pounds
	
Scenario: Test Neptune Weight
	Given I am on the weight calculator input page
	And I choose the planet Neptune
	And I enter a weight of 100 pounds
	When I submit the weight calculator form
	Then the calculated weight is 143 pounds
	
Scenario: Test Uranus Weight
	Given I am on the weight calculator input page
	And I choose the planet Uranus
	And I enter a weight of 100 pounds
	When I submit the weight calculator form
	Then the calculated weight is 109 pounds
	