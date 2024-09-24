@test
Feature: Smart care Generate Refferal Summary Report fb without mock


  @GenerateRefferalSummaryReport
  Scenario: Verify that user provide proper input payload & Get the output payload for GenerateRefferalSummaryReport
    Given user builds the input value for Generate Refferal Summary Report
    When  user runs the FB for Generate Refferal Summary Report
    Then  user gets the Fboutput for Generate Refferal Summary Report
    And   User validates the result using for Generate Refferal Summary Report
