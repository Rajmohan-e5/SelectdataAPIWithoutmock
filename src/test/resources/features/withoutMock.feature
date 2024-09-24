@test
  Feature: LockoasisAssesment fb without mock


@EditLockFb
Scenario: Verify that user provide proper input payload & Get the output payload for edit lock
Given user builds the input value for edit lock
When  user runs the FB for edit lock
Then  user gets the Fboutput for edit lock
And   User validates the result using for edit lock