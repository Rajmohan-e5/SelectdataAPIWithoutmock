@Test
Feature: Generate Referral summary report  Fb Prevalidation Testcases

  @PositiveFlow
  Scenario: Verify that Generate Referral summary report fb runs successfully when user provides proper input payload
    Given User builds inputpayload for Generate Referral summary report fb
    When user runs fb using positive input file of Generate Referral summary report fb
    Then User validates the result after Generate Referral summary report fb runs successfully

  @ClientIDNull
  Scenario Outline: Verify that error message is displayed when Client ID field is Null
    Given User builds the input file for SmartCare Generate Referral summary report fb when ClientID is Null
    When user runs fb using input file of Generate Referral summary report fb fb when Client ID is Null
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when Client ID is Null
    Examples:
      | errorCode            | fieldName                                                                  | errorMessage                            |
      | E5.SCHEMA.VAL.FAILED | generateReferralReportCriteria.generateReferralReportInputPayload.clientId | The 'clientId' values must be a integer |

  @ClientIDisMinimumchar
  Scenario Outline: Verify that error message is displayed when Client ID field is lower then minimum charecter
    Given User builds the input file for SmartCare Generate Referral summary report fb when ClientID is lower then minimum charecter
    When user runs fb using input file of Generate Referral summary report fb fb when Client ID is lower then minimum charecter
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when Client ID is lower then minimum charecter
    Examples:
      | errorCode            | fieldName                                                                  | errorMessage                                |
      | E5.SCHEMA.VAL.FAILED | generateReferralReportCriteria.generateReferralReportInputPayload.clientId | The 'clientId' must have minimum value of 0 |

  @EpisodeIDNull
  Scenario Outline: Verify that error message is displayed when Epidsode ID field is Null
    Given User builds the input file for SmartCare Generate Referral summary report fb when Episode ID is Null
    When user runs fb using input file of Generate Referral summary report fb fb when Episode ID is Null
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when Episode ID is Null
    Examples:
      | errorCode            | fieldName                                                                   | errorMessage                             |
      | E5.SCHEMA.VAL.FAILED | generateReferralReportCriteria.generateReferralReportInputPayload.episodeId | The 'episodeId' values must be a integer |

  @EpisodeIDisMinimumchar
  Scenario Outline: Verify that error message is displayed when Episode ID field is lower then minimum charecter
    Given User builds the input file for SmartCare Generate Referral summary report fb when EpisodeID is lower then minimum charecter
    When user runs fb using input file of Generate Referral summary report fb fb when Episode ID is lower then minimum charecter
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when Episode ID is lower then minimum charecter
    Examples:
      | errorCode            | fieldName                                                                  | errorMessage                                |
      | E5.SCHEMA.VAL.FAILED | generateReferralReportCriteria.generateReferralReportInputPayload.episodeId |The 'episodeId' must have minimum value of 0 |

  @FacititycodeNull
  Scenario Outline: Verify that error message is displayed when Facility code field is Null
    Given User builds the input file for SmartCare Generate Referral summary report fb when Facility code is Null
    When user runs fb using input file of Generate Referral summary report fb fb when Facility code is Null
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when Facility code is Null
    Examples:
      | errorCode            | fieldName                                                                      | errorMessage                               |
      | E5.SCHEMA.VAL.FAILED | generateReferralReportCriteria.generateReferralReportInputPayload.facilityCode | The 'facilityCode' values must be a string |


  @FacititycodeisEmpty
  Scenario Outline: Verify that error message is displayed when Facility code field is empty
    Given User builds the input file for SmartCare Generate Referral summary report fb when Facility code is empty
    When user runs fb using input file of Generate Referral summary report fb fb when Facility code is empty
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when Facility code is empty
    Examples:
      | errorCode            | fieldName                                                                      | errorMessage                                          |
      | E5.SCHEMA.VAL.FAILED | generateReferralReportCriteria.generateReferralReportInputPayload.facilityCode | The 'facilityCode' must have atleast 3 character long |

  @FacititycodeexceedMaxChar
  Scenario Outline: Verify that error message is displayed when Facility code field exceeds maximum charecters
    Given User builds the input file for SmartCare Generate Referral summary report fb when Facility code exceeds maximum charecters
    When user runs fb using input file of Generate Referral summary report fb fb when Facility code exceeds maximum charecters
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when Facility code exceeds maximum charecters
    Examples:
      | errorCode            | fieldName                                                                      | errorMessage                                         |
      | E5.SCHEMA.VAL.FAILED | generateReferralReportCriteria.generateReferralReportInputPayload.facilityCode | The 'facilityCode' must have atmost 3 character long |

  @RecordDateNull
  Scenario Outline: Verify that error message is displayed when Record Date field is Null
    Given User builds the input file for SmartCare Generate Referral summary report fb when Record Date is Null
    When user runs fb using input file of Generate Referral summary report fb fb when Record Date is Null
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when Record Date is Null
    Examples:
      | errorCode            | fieldName                                                                    | errorMessage                             |
      | E5.SCHEMA.VAL.FAILED | generateReferralReportCriteria.generateReferralReportInputPayload.recordDate | The 'recordDate' values must be a string |

  @RecordDateInvalidFormat
  Scenario Outline: Verify that error message is displayed when Record Date invalid format
    Given User builds the input file for SmartCare Generate Referral summary report fb when Record Date is invalid format
    When user runs fb using input file of Generate Referral summary report fb fb when Record Date is in invalid format
    Then User validate the output as "<errorCode>","<fieldName>" and "<errorMessage>" when Record Date is invalid format
    Examples:
      | errorCode            | fieldName                                                                    | errorMessage                                                    |
      | E5.SCHEMA.VAL.FAILED | generateReferralReportCriteria.generateReferralReportInputPayload.recordDate | The 'recordDate' should be in 'yyyy-mm-ddTHH:MM:SS.000Z' format |