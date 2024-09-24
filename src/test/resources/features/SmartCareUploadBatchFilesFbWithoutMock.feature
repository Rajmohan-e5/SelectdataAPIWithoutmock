@test
Feature: Smart care Upload Batch files fb without mock


  @UploadBatchFilesFB
  Scenario: Verify that user provide proper input payload & Get the output payload for UploadBatchFilesFB
    Given user builds the input value for Upload Batch Files FB
    When  user runs the FB for Upload Batch Files FB
    Then  user gets the Fboutput for Upload Bathc Files FB
    And   User validates the result using for Upload Batch Files FB