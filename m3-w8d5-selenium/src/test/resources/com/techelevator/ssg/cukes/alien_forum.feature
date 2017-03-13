Feature: Alien Forum Post

Scenario: Test Forum Post
	Given I am on the forum view page
	And I select the forum post page
	And I enter a username of Name
	And I enter a subject of Subject
	And I enter a message of Message
	When I submit the forum form
	Then the post is Name Subject Message

