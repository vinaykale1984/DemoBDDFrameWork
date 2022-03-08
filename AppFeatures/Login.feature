@Login
Feature: Login user validations
	Scenario: Valid existing user access the applicationwirh valid credentials
	Given User is on the landing page of the app
	When Click on Take the tour button
	When User swipes to reach login page
	When Enter the username and password
	And Click on sign in button
	Then User should navigate to homepage