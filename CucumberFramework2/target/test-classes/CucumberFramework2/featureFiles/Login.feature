@Testsuite1
Feature: Login in to account
	Existing ubs user should be able to login into account using correct credentials

@Test1
Scenario: Login into account with correct details
	Given User navigets to ubs website
	And User clicks on the login button on homepage
	And User clicks on the type of login
	And User enters valid username
	And User enters a valid password
	When User clicks on the login button
	Then User should be taken to scuccesful login page

@Test2
Scenario: Login into account with incorrect username
	Given User navigets to ubs website
	And User clicks on the login button on homepage
	And User clicks on the type of login
	And User enters invalid username
	And User enters a valid password
	When User clicks on the login button
	Then User should be taken to unscuccesful login page

@Test2
Scenario: Login into account with incorrect password
	Given User navigets to ubs website
	And User clicks on the login button on homepage
	And User clicks on the type of login
	And User enters valid username
	And User enters a invalid password
	When User clicks on the login button
	Then User should be taken to unscuccesful login page
	
@Test3
Scenario: Login into account with incorrect credentials
	Given User navigets to ubs website
	And User clicks on the login button on homepage
	And User clicks on the type of login
	And User enters invalid username
	And User enters a invalid password
	When User clicks on the login button
	Then User should be taken to unscuccesful login page
	
	