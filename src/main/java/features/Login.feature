Feature: Login user validations

	@appium
	Scenario: Valid existing user access the application with invalid credentials
	Given User is on the landing page of the app
	When Click on login button
	When Enter the username 
	When Enter the password
	And Click on signin button
	Then User should navigate to homepage