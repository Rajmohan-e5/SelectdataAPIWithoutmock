@test
Feature: Smart care Get client info fb without mock



@GetClients
Scenario: Verify the user creates a proper input and gets the proper response
Given user builds the input value for Get clients fb
When  user runs the FB for get clients fb
Then  user gets the Fboutput for get clients fb
And   User validates the result using for get cleints fb