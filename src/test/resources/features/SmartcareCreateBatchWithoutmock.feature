@test
Feature: Smart care Create batch fb without mock



  @CreateBatchFB
  Scenario: Verify the user creates a proper input and gets the proper response
    Given user builds the input value for Create batch fb
    When  user runs the FB for Create batch fb
    Then  user gets the Fboutput for Create batchs fb
    And   User validates the result using for Create batch fb