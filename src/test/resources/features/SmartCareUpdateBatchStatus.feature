@test
Feature: Smart care Update batch status fb without mock



  @UpdateBatchStatus
  Scenario: Verify the user creates a proper input and gets the proper response
    Given user builds the input value for update batch status fb
    When  user runs the FB for update batch status fb
    Then  user gets the Fboutput for update batch status fb
    And   User validates the result using for update batch status fb