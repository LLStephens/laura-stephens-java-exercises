Feature: Alien Store Page

Scenario: Test Store Form Coffee Mug
	Given I am on the store view page
	And I select the input page for Coffee Mug
	And I enter a quantity of 4
	When I submit the store form
	Then the cart has 4 items


