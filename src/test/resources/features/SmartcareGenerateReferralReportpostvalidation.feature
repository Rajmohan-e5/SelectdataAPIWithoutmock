@Test
Feature:Post validation test cases for Smartcare Generate Referral Summary Report FB


  @PostValidationPositive
  Scenario: Verify that user provide proper output payload for post validation in Smartcare Generate Referral Summary Report FB
    Given User build the function block output payload for Smartcare Generate Referral Summary Report FB positive flow
    When User runs the Smartcare Generate Referral Summary Report FB positive flow
    Then User validate the output for Smartcare Generate Referral Summary Report FB positive flow

  @StatusNUll
  Scenario Outline: Verify that Schema validation error should thrown when Status is Null in Generate Referral Summary Report FB
    Given User build the function block output payload for Generate Referral Summary Report FB FB postvalidation
    When User runs the Generate Referral Summary Report FB FB when file Status field is null
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when file Status field is null in Generate Referral Summary Report FB
    Examples:
      | errorCode            | fieldName                                  | errorMessage                                                                           |
      | E5.SCHEMA.VAL.FAILED | generateReferralReportOutputPayload.status | The 'generateReferralReportStatus' value should be one of the following:SUCCESS,FAILED|