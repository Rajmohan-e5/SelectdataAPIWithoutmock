@test
Feature: Smart care Get Refferal Summary Report fb without mock


  @GetRefferalSummaryReport
  Scenario: Verify that user provide proper input payload & Get the output payload for Get RefferalSummaryReport
    Given user builds the input value for Get Refferal Summary Report
    When  user runs the FB for Get Refferal Summary Report
    Then  user gets the Fboutput for Get Refferal Summary Report
    And   User validates the result using for Get Refferal Summary Report