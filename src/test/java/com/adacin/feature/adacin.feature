Feature: Hotel Booking In Adactin Application 

Scenario: User Login Into Adactin Application 
	Given user Launch The Browser And Hit URL 
	When user Enter The User Name Into The UserName Field 
	And user Enter The Password Into The Password Field 
	Then user Click The Login Button 
	
	
Scenario: user Enter Into The Hotel Search Page 
	When user Select The Hotel Location 
	And user Select The Hotel Name 
	And user Select Room Type 
	Then user Click The Search Button 
	
Scenario: user Enter Into The Select Hotel Page 
	When user Select The Hotel 
	Then user Click Continue Button 
	
Scenario: user Enter Into The Hotel Booking Page 
	When user Enter The Name In First Name Field 
	And user Enter Last Name In Last Name Field 
	And user Enter Billing Address In Address Field 
	And user Enter Cc Number In Cc Field 
	And user Enter Card Type In Card Type Field 
	And user Enter Expiry Date In Expiry Date Field 
	And user Enter Expiry Year Ib Expiry Year Field 
	And user Enter Cvv In Cvv Field 
	Then user Click Book Now Button 
	
Scenario: user Enter Into The Booking Confirmation Page 
	When user Take Screen Shot 
	Then user Logout The Page 
