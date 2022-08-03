Feature: Adactin Hotel Booking

@regression_run
Scenario Outline: Login Functionality for Adactin Hotel Booking
Given User is launch the application
When User is enter the "<Username>" in username field
And User is enter the "<Password>" in password field
Then User is click on submit button

Examples:
				  |Username|Password|
					|admin|admin123|
					|root|root123|
					|arvind19|12345678|


@regression_run
Scenario: Search Hotel
When User is enter the location
And User is select the Hotel Name

#@regression_run
#Scenario: Change Password
#When User is click on the Password hyperlink



