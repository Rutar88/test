Feature: Login in to account
	Exiustin ubs user should be albe to login into acount using correct credentials

Scenario: Login into account with correct details
	Given User naviagets to ubs website
	And User clicks on the login button on homepage
	And User enters valid username
	And User enters a valid password
	When User clicks on the login button
	Then User should be taken to scuccesful login page